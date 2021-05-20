public class IfTest {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello");
        }

        int a = 10;
        int b = 20;
        boolean result = a < b;
        System.out.println(result);

        a = 20;
        if (10 < a) {
            System.out.println("大きい");
        }
    }
}