
// Exercise 7: Type Casting Example
public class Exercise7 {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // cast double to int
        int j = 50;
        double converted = j; // automatic cast int to double

        System.out.println("Original double: " + d);
        System.out.println("Cast to int: " + i);
        System.out.println("Original int: " + j);
        System.out.println("Cast to double: " + converted);
    }
}
