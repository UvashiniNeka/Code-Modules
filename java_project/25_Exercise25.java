
// Exercise 25: HashMap Example
import java.util.HashMap;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        System.out.print("Enter student ID to retrieve name: ");
        int id = sc.nextInt();
        String name = map.getOrDefault(id, "ID not found");
        System.out.println("Name: " + name);
        sc.close();
    }
}
