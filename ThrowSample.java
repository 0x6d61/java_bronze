public class ThrowSample {
    public void test(String val) throws Exception {
        if (val == null) {
            throw new Exception();
        }
    }
}