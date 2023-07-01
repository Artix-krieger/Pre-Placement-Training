package sixthassignment;

public class Problem2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // number of rows
        if (m == 0) return false; // base case condition
        int n = matrix[0].length; // number of columns

        // binary search algorithm
        int low = 0, high = m * n - 1;
        int midIdx, midElement, rowIdx, colIdx;
        while (low <= high) {
            midIdx = low + (high - low) / 2;

            rowIdx = midIdx / n;
            colIdx = midIdx % n;

            midElement = matrix[rowIdx][colIdx];

            if (target == midElement) return true;
            else {
                if (target < midElement) high = midIdx - 1;
                else low = midIdx + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
