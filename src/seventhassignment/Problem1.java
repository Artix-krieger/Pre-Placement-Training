package seventhassignment;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!map.containsKey(original)) {
                if (!map.containsValue(replacement)) map.put(original, replacement);
                else return false;
            } else {
                char exist = map.get(original);
                if (exist != replacement) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "kikp";

        boolean res = isIsomorphic(s, t);

        System.out.println("Is Isomorphic: " + res);

    }
}
