import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
    private final  static String URL = "jdbc:mysql://localhost:3306/training";
    private final  static String USER = "root";
    private final  static String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            System.out.println("testing connection.");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connection successful.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
