package thirdassignment;

public class Problem6 {
    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n = n ^ num;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 4, 3, 4, 5, 1, 5};
        int res = singleNumber(nums);
        System.out.println(res);
    }
}
