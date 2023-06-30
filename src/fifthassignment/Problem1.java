package fifthassignment;

import java.util.Arrays;

public class Problem1 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int og = original.length;
        if (og != m * n) return new int[0][0];

        int[][] res = new int[m][n];
        for (int i = 0; i < og; i++) {
            int row = i / n;
            int col = i % n;
            res[row][col] = original[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] res = construct2DArray(original, m, n);
        for (int[] num : res) {
            System.out.println(Arrays.toString(num));
        }
    }
}
