package secondassignment;

import java.util.Arrays;

public class Problem1 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];  // Add every element at even positions (0-indexed)
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
}
