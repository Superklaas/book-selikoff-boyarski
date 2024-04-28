import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClosingResources {

    public static final String URL = "jdbc:hsqldb:file:zoo";
    private static final String GET_ALL_ANIMALS = "SELECT * FROM ANIMALS";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL);
            PreparedStatement ps = conn.prepareStatement(GET_ALL_ANIMALS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("NAME"));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getSQLState());
            System.err.println(e.getErrorCode());
        }
    }

}
