package fifthassignment;

import java.util.Arrays;

public class Problem5 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int num1 : arr1) {
            int idx = binarySearch(arr2, num1 - d);
            if (idx >= 0 && idx < arr2.length && arr2[idx] <= num1 + d) {
                continue;
            }
            count++;
        }
        return count;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        int res = findTheDistanceValue(arr1, arr2, d);
        System.out.println(res);
    }
}
