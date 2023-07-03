package seventhassignment;

public class Problem8 {
    public static boolean onLine(int[] p1, int[] p2, int[] p3) {
        int x = p1[0], y = p1[1], x1 = p2[0], y1 = p2[1], x2 = p3[0], y2 = p3[1];
        return ((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1));
    }

    /*
    * The point is if we take points p1(x, y), p2(x1, y1), p3(x3, y3),
    * slopes of any two pairs is same then p1, p2, p3 lies on same line.
    * slope from p1 and p2 is y - y1 / x - x1
    * slope from p2 and p3 is y2 - y1 / x2 - x1
    * if these two slopes equal, then p1, p2, p3 lies on same line.
    * Mathematical Formula
    *   y - y1  =   x - x1
    *  --------    --------
    *   y2 - y1    x2 - x1
    *
    * This can also be written as
    *
    * (y-y1)(x2-x1) = (x-x1)(y2-y1)
    * */

    public static boolean checkStraightLine(int[][] coordinates) {
        for (int i = 2; i < coordinates.length; i++) {
            if (!onLine(coordinates[i], coordinates[0], coordinates[1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] coordinates2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        boolean res = checkStraightLine(coordinates);
        boolean res2 = checkStraightLine(coordinates2);
        System.out.println(res);
        System.out.println(res2);
    }
}
