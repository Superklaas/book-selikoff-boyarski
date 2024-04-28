import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteUpdate {

    public static void main(String[] args) {

        String sql = "INSERT INTO EXHIBITS VALUES (20,'Deer',1.5)";

        try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             PreparedStatement ps = conn.prepareStatement(sql)) {
            int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted);
        } catch (SQLException e) {
            System.out.println("problem making connection");
        }

    }

}
