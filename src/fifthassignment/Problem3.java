package fifthassignment;

import java.util.Arrays;

public class Problem3 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];
        int low = 0, high = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int start = nums[low] * nums[low];
            int end = nums[high] * nums[high];
            if (start > end) {
                res[i] = start;
                low++;
            } else {
                res[i] = end;
                high--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-2,0,3,10};
        System.out.println(Arrays.toString(nums));
        int[] res = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }
}
