import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallingStoredProcedures {

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {

            // procedure without parameters
            String sql = "{call read_e_names()}";
            try (CallableStatement cs = conn.prepareCall(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                 ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }

            // procedure with IN parameter
            sql = "{call read_names_by_letter(?)}";
            try (CallableStatement cs = conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                cs.setString(1, "E");
                try (ResultSet rs = cs.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                    }
                }
            }

            // procedure with OUT parameter
            sql = "{? = call magic_number(?)}";
            try (CallableStatement cs = conn.prepareCall(sql)) {
                cs.registerOutParameter("num", Types.INTEGER);
                cs.execute();
                System.out.println(cs.getInt("num"));
            }

            // procedure with INOUT parameter
            sql = "{? = call double_number(?)}";
            try (CallableStatement cs = conn.prepareCall(sql)) {
                cs.setInt("num", 3);
                cs.registerOutParameter("num", Types.INTEGER);
                cs.execute();
                System.out.println(cs.getInt("num"));
            }


        } catch (SQLException e) {
            System.err.println("Problem during database operation");
        }

    }

}
