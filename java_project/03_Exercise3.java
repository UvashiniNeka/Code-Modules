
// Exercise 3: Even or Odd Checker
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");
        sc.close();
    }
}
