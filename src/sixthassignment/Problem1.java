package sixthassignment;

import java.util.Arrays;

public class Problem1 {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] res = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') res[i] = low++;
            else res[i] = high--;
        }
        res[n] = low;
        return res;
    }

    public static void main(String[] args) {
        String s1 = "IDID";
        String s2 = "III";
        String s3 = "DDI";
        int[] res1 = diStringMatch(s1);
        int[] res2 = diStringMatch(s2);
        int[] res3 = diStringMatch(s3);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }
}
