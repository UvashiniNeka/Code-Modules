
// Exercise 16: Palindrome Checker
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Palindrome: " + input.equals(reversed));
        sc.close();
    }
}
