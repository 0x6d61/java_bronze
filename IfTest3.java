import java.io.Console;

public class IfTest3 { 
    public static void main(String[] args) throws Exception {
        Console console = System.console();

        int score = Integer.parseInt(console.readLine());

        if (0 <= score && score <= 100) {
            System.out.println("範囲内です");
        }else{
            System.out.println("範囲外です");
        }
    }
}