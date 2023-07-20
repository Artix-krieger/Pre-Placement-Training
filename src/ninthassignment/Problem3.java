package ninthassignment;

public class Problem3 {
    public static int peakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 2] < nums[n - 1]) return n - 1;
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid - 1] < nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 5, 6, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1};
        int peak = peakElement(arr1);
        int peak2 = peakElement(arr2);
        int peak3 = peakElement(arr3);
        System.out.println("Peak Element is at index: " + peak);
        System.out.println("Peak Element is at index: " + peak2);
        System.out.println("Peak Element is at index: " + peak3);
    }
}
