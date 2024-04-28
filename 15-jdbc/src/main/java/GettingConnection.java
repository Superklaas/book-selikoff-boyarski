import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GettingConnection {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            System.out.println(connection);
        }

    }

}
