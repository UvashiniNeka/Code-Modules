
// Exercise 24: ArrayList Example
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student names (type 'end' to finish):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("end")) break;
            names.add(name);
        }
        System.out.println("Students:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
