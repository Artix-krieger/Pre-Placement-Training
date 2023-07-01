package sixthassignment;

public class Problem3 {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int i = 0;

        // walk up
        while (i + 1 < n && arr[i] < arr[i + 1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == n - 1)
            return false;

        // walk down
        while (i + 1 < n && arr[i] > arr[i + 1])
            i++;

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        int[] arr2 = {3, 5, 5};
        int[] arr3 = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2));
        System.out.println(validMountainArray(arr3));
    }
}
