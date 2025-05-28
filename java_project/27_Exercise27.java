
// Exercise 27: Lambda Expressions
import java.util.Arrays;
import java.util.List;

public class Exercise27 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        names.forEach(System.out::println);
    }
}
