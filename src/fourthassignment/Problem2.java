package fourthassignment;

import java.util.*;

public class Problem2 {

    public static List<Integer> getElement(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums1) {
            if (!set2.contains(num)) set1.add(num);
        }
        return new ArrayList<>(set1);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElement(nums1, nums2), getElement(nums2, nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2));
    }
}
