
// Exercise 23: File Reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise23 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}
