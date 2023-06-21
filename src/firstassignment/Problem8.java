package firstassignment;

import java.util.Arrays;

public class Problem8 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long sumoffirstnnaturalno = n*(n+1L)/2;
        long sumofsquareoffirstnnaturalno = (n*(n+1L)*(2L *n+1)) / 6;
        long sumofelement = 0;
        long sumofsquareofelement = 0;
        for (int num : nums) {
            sumofelement += num;
            sumofsquareofelement += (long)num*num;
        }
        long a = sumoffirstnnaturalno-sumofelement;
        long b = sumofsquareoffirstnnaturalno - sumofsquareofelement;

        // x+y =  x^2-y^2 / x-y
        long val = b/a;

        int missing = (int)(a+val)/2;
        int duplicate = missing - (int)a;

        return new int[]{duplicate,missing};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
}
