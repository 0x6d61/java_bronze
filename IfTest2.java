import java.io.Console;

public class IfTest2 {

  public static void main(String[] args) throws Exception {
    Console console = System.console();
    int a = Integer.parseInt(console.readLine());
    if (10 < a) {
      System.out.println("大きい");
    } else if (a < 0) {
      System.out.println("エラー");
    } else {
      System.out.println("小さい");
    }
  }
}
