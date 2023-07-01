package sixthassignment;

import java.util.Arrays;

public class Problem5 {
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int ans = 0;
        int i = 0;
        int j = nums2.length - 1;

        while (i < nums1.length && j >= 0) {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 3, 4, 2};
        int[] nums2 = {4, 2, 2, 5};
        int res = minProductSum(nums1, nums2);
        System.out.println(res);
    }
}
