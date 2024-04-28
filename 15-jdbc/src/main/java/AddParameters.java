import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Types;

public class AddParameters {

    public static void main(String[] args) throws SQLException {
        try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             var ps = conn.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?)")) {
            ps.setInt(1, 1);
            ps.setString(2, "Klaas");
            ps.setNull(3, Types.INTEGER);
            int recordsInserted = ps.executeUpdate();
            System.out.println(recordsInserted);
        }
    }

}
