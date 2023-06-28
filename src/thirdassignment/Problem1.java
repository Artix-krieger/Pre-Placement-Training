package thirdassignment;

import java.util.Arrays;

public class Problem1 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int res = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(diff) > Math.abs(sum - target)) {
                    diff = sum - target;
                    res = sum;
                }
                if (sum < target) j++;
                else k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int res = threeSumClosest(nums, target);
        System.out.println(res);
    }
}
