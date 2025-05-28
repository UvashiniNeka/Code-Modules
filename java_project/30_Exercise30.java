
// Exercise 30: Pattern Matching for switch (Java 21)
public class Exercise30 {
    public static void main(String[] args) {
        Object obj = "Hello";
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}
