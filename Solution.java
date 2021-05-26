import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        String[] addr =  address.split(Pattern.quote("."));
        String result = String.join("[.]",addr);
        return result;
    }
}