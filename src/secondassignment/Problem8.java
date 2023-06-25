package secondassignment;

public class Problem8 {
    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];

        for (int x: nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * k);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int[] nums2 = {0, 10};
        int k2 = 2;
        int[] nums3 = {1, 3, 6};
        int k3 = 3;
        int res = smallestRangeI(nums, k);
        int res2 = smallestRangeI(nums2, k2);
        int res3 = smallestRangeI(nums3, k3);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
