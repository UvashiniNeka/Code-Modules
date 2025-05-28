
// Exercise 22: File Writing
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text to write: ");
            String text = sc.nextLine();
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
