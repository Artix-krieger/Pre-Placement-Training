package ninthassignment;

import java.util.Arrays;

public class Problem1 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int low = 0, high = numbers.length - 1;
        while (low <= high) {
            if (numbers[low] + numbers[high] < target) low++;
            else if (numbers[low] + numbers[high] > target) high--;
            else {
                ans[0] = low + 1;
                ans[1] = high + 1;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res = twoSum(nums1, target1);
        System.out.println(Arrays.toString(res));

    }
}
