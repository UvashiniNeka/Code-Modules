
// Exercise 28: Stream API
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise28 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + even);
    }
}
