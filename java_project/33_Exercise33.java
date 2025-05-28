
// Exercise 33: Transaction Handling in JDBC
import java.sql.*;

public class Exercise33 {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            con.commit();
            System.out.println("Transaction committed.");
        } catch (SQLException e) {
            System.out.println("Rollback due to error: " + e.getMessage());
        }
    }
}
