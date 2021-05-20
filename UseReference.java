public class UseReference {
    public static void main(String[] args) {
        Test a = new Test();
        Test b = a;
        a.setName("A");
        b.setName("B");
        a.sayHello();
        b.sayHello();
    }
}