package firstassignment;

import java.util.Arrays;

public class Problem5 {
    public static int[] plusOne(int[] digits) {
        int p9 = digits.length - 1;
        while (p9 >= 0 && digits[p9] == 9) {
            p9--;
        }
        if (p9 == -1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        int[] res = new int[digits.length];
        res[p9] = digits[p9] + 1;
        System.arraycopy(digits, 0, res, 0, p9);
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
