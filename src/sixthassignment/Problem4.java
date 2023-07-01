package sixthassignment;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static int findMaxLength(int[] nums) {
        int maxlength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) sum += (-1);
            else sum += 1;
            if (map.containsKey(sum)) {
                int idx = map.get(sum);
                int len = i - idx;
                if (len > maxlength) maxlength = len;
            }
            else map.put(sum, i);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        int[] nums2 = {0, 1, 0};
        int res1 = findMaxLength(nums1);
        int res2 = findMaxLength(nums2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
