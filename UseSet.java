import java.util.Set;
import java.util.HashSet;

public class UseSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        for (String str : set) {
            System.out.println(str);
        }
    }
}