package ninthassignment;

import java.util.Arrays;

public class Problem7 {
    public static int merge(int[] arr, int low, int mid, int high) {
        int swap = 0;
        // left subarray
        int[] left_subarray = Arrays.copyOfRange(arr, low, mid + 1);
        int n1 = left_subarray.length;
        // right subarray
        int[] right_subarray = Arrays.copyOfRange(arr, mid + 1, high + 1);
        int n2 = right_subarray.length;

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left_subarray[i] < right_subarray[j]) {
                arr[k++] = left_subarray[i++];
            } else {
                arr[k++] = right_subarray[j++];
                // calculate swap
                swap += (mid + 1) - (low + i);
            }
        }

        while (i < n1) {
            arr[k++] = left_subarray[i++];
        }

        while (j < n2) {
            arr[k++] = right_subarray[j++];
        }
        return swap;
    }

    public static int countInversion(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            // divide the array into two sub-problems
            int mid = low + (high - low) / 2;
            // solve the sub-problem using recursion
            // conquer left subarray
            count += countInversion(arr, low, mid);
            // conquer right subarray
            count += countInversion(arr, mid + 1, high);
            //combine the solution
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;
        int result = countInversion(arr, 0, n - 1);
        System.out.println("The count of Inversion are: " + result);
    }
}
