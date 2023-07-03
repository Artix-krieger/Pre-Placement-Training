package seventhassignment;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');

        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "69", num2 = "692";
        boolean res1 = isStrobogrammatic(num);
        boolean res2 = isStrobogrammatic(num2);
        System.out.println(res1);
        System.out.println(res2);

    }
}
