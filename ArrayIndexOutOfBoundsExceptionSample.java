public class ArrayIndexOutOfBoundsExceptionSample {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[3] = 10;
        System.out.println(array[0]);
        System.out.println("finish");
    }
}