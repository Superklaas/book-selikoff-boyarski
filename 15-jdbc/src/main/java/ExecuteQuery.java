import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQuery {

    public static final String URL = "jdbc:hsqldb:file:zoo";
    public static final String SQL = "SELECT * FROM EXHIBITS";

    public static void main(String[] args) {
        try (var conn = DriverManager.getConnection(URL);
             var ps = conn.prepareStatement(SQL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("NAME"));
            }
        } catch (SQLException e) {
            System.out.println("problem calling database");
        }
    }

}
