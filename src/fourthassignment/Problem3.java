package fourthassignment;

import java.util.Arrays;

public class Problem3 {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix: ");
        for (int[] ele : matrix) {
            System.out.println(Arrays.toString(ele));
        }
        System.out.println("-------------------------");
        System.out.println("Transpose of Matrix: ");
        int[][] res = transpose(matrix);
        for (int[] ele : res) {
            System.out.println(Arrays.toString(ele));
        }
    }
}
