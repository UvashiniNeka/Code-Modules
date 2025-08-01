
// Exercise 20: Try-Catch Example
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}
