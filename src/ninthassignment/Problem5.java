package ninthassignment;

public class Problem5 {
    public static int majorityElement(int[] arr) {
        int majority = arr[0];
        int majority_count = 1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] == majority) {
                majority_count++;
            } else {
                majority_count--;
                if (majority_count == 0) {
                    majority = arr[i];
                    majority_count = 1;
                }
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}
