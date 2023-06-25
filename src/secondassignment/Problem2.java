package secondassignment;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> set = new HashSet<>();
        set.add(candyType[0]);
        for (int i = 1; i < n; i++) {
            if (candyType[i - 1] != candyType[i]) {
                set.add(candyType[i]);
            }
            if (set.size() > n / 2) return n / 2;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int res = distributeCandies(candyType);
        System.out.println(res);
    }
}
