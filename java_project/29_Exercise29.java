
// Exercise 29: Records
import java.util.List;

record Person(String name, int age) {}

public class Exercise29 {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 25), new Person("Bob", 30));
        people.stream().filter(p -> p.age() > 26).forEach(System.out::println);
    }
}
