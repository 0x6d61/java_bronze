public class UseThrowSample {
    public static void main(String[] args) {
        ThrowSample s = new ThrowSample();
        try {
            s.test(null);
        }catch (Exception e) {
            System.out.println("exception");
        }
    }
}