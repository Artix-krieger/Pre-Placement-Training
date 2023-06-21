package firstassignment;

import java.util.Arrays;

public class Problem4 {
    public static void merge(Integer[] nums1, int m, Integer[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) break;
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums1 = new Integer[]{1,2,3,0,0,0};
        Integer[] nums2 = new Integer[]{2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
