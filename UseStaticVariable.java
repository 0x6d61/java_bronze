public class UseStaticVariable {
    public static void main(String[] args) {
        StaticVariable.num = 10;
        StaticVariable sample = new StaticVariable();
        System.out.println(sample.num);
    }
}