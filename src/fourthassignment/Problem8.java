package fourthassignment;

import java.util.Arrays;

public class Problem8 {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n + i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(nums));
        int[] res = shuffle(nums, n);
        System.out.println(Arrays.toString(res));
    }
}
