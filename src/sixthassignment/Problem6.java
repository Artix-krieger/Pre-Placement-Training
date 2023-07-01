package sixthassignment;

import java.util.Arrays;

public class Problem6 {
    public static int[] findOriginalArray(int[] nums) {
        // use counting sort
        int n = nums.length;
        if (n % 2 != 0) return new int[]{};

        int[] res = new int[n / 2];
        int[] freq = new int[100001];

        for (int ele : nums) freq[ele] += 1;

        int index = 0;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0 && i * 2 < 100001 && freq[i * 2] > 0) {
                freq[i]--;
                freq[i * 2]--;
                if (freq[i * 2] < 0) return new int[]{};
                res[index] = i;
                index++;
            }
        }

        for (int j : freq) if (j != 0) return new int[]{};

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 6, 8};
        System.out.println(Arrays.toString(nums));
        int[] res = findOriginalArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
