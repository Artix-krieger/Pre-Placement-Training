package secondassignment;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    public static int findLHS(int[] nums) {
        int longest = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (int num: map.keySet()){
            if (map.containsKey(num+1)) {
                longest = Math.max(longest,map.get(num)+map.get(num+1));
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int res = findLHS(nums);
        System.out.println(res);
    }
}
