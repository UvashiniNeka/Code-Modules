
// Exercise 32: Insert and Update Operations in JDBC
import java.sql.*;

public class Exercise32 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:students.db")) {
            String insert = "INSERT INTO students(id, name) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, 105);
            ps.setString(2, "Diana");
            ps.executeUpdate();

            String update = "UPDATE students SET name=? WHERE id=?";
            ps = con.prepareStatement(update);
            ps.setString(1, "Diane");
            ps.setInt(2, 105);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
