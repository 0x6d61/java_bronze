import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMapSample {
    public static void main(String[] args) {
        Map<String,Item> menu = new HashMap<>();

        menu.put("apple",new Item("apple", 100));
        menu.put("orange",new Item("orange",100));
        menu.put("banana",new Item("banana",120));

        Set<String> keys = menu.keySet();
        for (String key : keys) {
            Item item = menu.get(key);
            System.out.println(item.getName());
        }
    }
}
