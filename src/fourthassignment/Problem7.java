package fourthassignment;

public class Problem7 {
    public static int maxCount(int m, int n, int[][] ops) {
        int[] common = new int[]{m, n};

        for (int[] op : ops) {
            common[0] = Math.min(common[0], op[0]);
            common[1] = Math.min(common[1], op[1]);
        }
        return common[0] * common[1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        int res = maxCount(m, n, ops);
        System.out.println(res);
    }
}
