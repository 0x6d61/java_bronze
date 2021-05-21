public class Validator {

  public static boolean isValidScore(int score) {
    if (score < 0 || 100 < score) {
      return false;
    }

    return true;
  }
}
