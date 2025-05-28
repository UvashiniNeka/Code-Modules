
// Exercise 8: Operator Precedence
public class Exercise8 {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result); // 5*2=10, then 10+10=20

        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2); // 15*2=30
    }
}
