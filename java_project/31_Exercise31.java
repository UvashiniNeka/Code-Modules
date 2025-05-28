
// Exercise 31: Basic JDBC Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise31 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:students.db")) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
