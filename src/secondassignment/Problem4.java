package secondassignment;

public class Problem4 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        int flower = 0;
        for (int i = 0; i < size; i++) {
            if (flowerbed[i] == 0) {
                int prev;
                if (i == 0 || flowerbed[i - 1] == 0) {
                    prev = 0;
                } else prev = 1;

                int next;
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    next = 0;
                } else next = 1;

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    flower++;
                }
            }
            if (flower >= n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean res = canPlaceFlowers(flowerbed, n);
        System.out.println(res);
    }
}
