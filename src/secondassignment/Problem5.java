package secondassignment;

public class Problem5 {
    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int curr : nums) {
            if (curr > max1) {
                max3 = max2;
                max2 = max1;
                max1 = curr;
            } else if (curr >= max2) {
                max3 = max2;
                max2 = curr;
            } else if (curr >= max3) {
                max3 = curr;
            }
            if (curr <= min1) {
                min2 = min1;
                min1 = curr;
            } else if (curr <= min2) {
                min2 = curr;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public static void main(String[] args) {
        int[] nums = {-100, -98, -1, 2, 3, 4};
        int res = maximumProduct(nums);
        System.out.println(res);
    }
}
