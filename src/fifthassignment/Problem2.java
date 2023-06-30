package fifthassignment;

public class Problem2 {
    public static int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        long mid, k;
        while (low <= high) {
            mid = low + (high - low) / 2;
            k = mid * (mid + 1) / 2; // k = k(k+1)/2
            if (k == n) {
                return (int) mid;
            } else if (k < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) high;
    }

    // Optimized Approach

    public static int arrangeCoinsOptimized(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = arrangeCoins(n);
        System.out.println(res);
        int res2 = arrangeCoinsOptimized(n);
        System.out.println(res2);
    }
}
