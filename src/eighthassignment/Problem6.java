package eighthassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem6 {
    public static List<Integer> findAnagrams(String s, String p) {
        int sn = s.length();
        int pn = p.length();
        List<Integer> res = new ArrayList<>();
        if (sn == 0 || pn == 0) return res;

        int[] pArr = new int[26];
        for (int i = 0; i < pn; i++) {
            char c = p.charAt(i);
            pArr[c - 'a']++;
        }

        int[] sArr = new int[26];
        for (int i = 0; i < sn; i++) {
            char c = s.charAt(i);
            sArr[c - 'a']++;
            if (i >= pn) {
                char c2 = s.charAt(i - pn);
                sArr[c2 - 'a']--;
            }
            if (Arrays.equals(pArr, sArr)) res.add(i - pn + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));

    }
}
