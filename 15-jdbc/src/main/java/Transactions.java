import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class Transactions {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            conn.setAutoCommit(false);
            Savepoint sp = conn.setSavepoint();
            boolean zebraUpdated = updateAcresByName(conn, "zebra", 5);
            boolean elephantUpdated = updateAcresByName(conn, "elephant", -5);
            if (!zebraUpdated || !elephantUpdated) {
                conn.rollback(sp);
            } else {
                boolean negativeValues = checkNegativeValues(conn);
                if (negativeValues) {
                    conn.rollback(sp);
                } else {
                    conn.commit();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL state: " + e.getSQLState());
            System.out.println("Error code: " + e.getErrorCode());
        }
    }

    private static boolean checkNegativeValues(Connection conn) throws SQLException {
        boolean negativeValues = false;
        String sql = """
                select count(*)
                from exhibits
                where acres < 0""";
        try (var ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { // when data present in rs, this means there is a negative value in column acres
                negativeValues = true;
            }
        }
        return negativeValues;
    }

    private static boolean updateAcresByName(Connection conn, String name, int acresToAdd) throws SQLException {
        String sql = """
                update exhibits
                set acres = ?
                where name = ?""";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
        }
    }

}
