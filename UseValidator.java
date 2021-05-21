public class UseValidator {

  public static void main(String[] args) {
    int score = 100;
    if (Validator.isValidScore(score)) {
      System.out.println("valid score");
    }
  }
}
