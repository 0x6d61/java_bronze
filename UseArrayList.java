import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0;i<10000;i++) {
            list.add(new Object());
        }
        System.out.println(list.size());
    }
}