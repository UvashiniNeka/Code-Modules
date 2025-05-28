
// Exercise 10: Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");
        while (guess != target) {
            guess = sc.nextInt();
            if (guess < target)
                System.out.println("Too low, try again.");
            else if (guess > target)
                System.out.println("Too high, try again.");
        }

        System.out.println("Congratulations! You guessed the number.");
        sc.close();
    }
}
