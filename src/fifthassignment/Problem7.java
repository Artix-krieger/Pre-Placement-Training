package fifthassignment;

public class Problem7 {
    public static int findMin(int[] nums) {
        int n = nums.length;
        if (n == 0) return -1;
        if (n == 1) return nums[0];
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && nums[mid] <= nums[mid - 1]) {
                return nums[mid];
            } else if (nums[low] <= nums[mid] && nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int minimum = findMin(nums);
        System.out.println(minimum);
    }
}
