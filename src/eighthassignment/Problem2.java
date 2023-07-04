package eighthassignment;


public class Problem2 {
    public static boolean checkValidString(String s) {
        int low = 0, high = 0;
        char[] carr = s.toCharArray();
        for (char c : carr) {
            if (c == '(') low = low + 1;
            else low = low - 1;
            if (c == ')') high = high + 1;
            else high = high - 1;
            if (high > 0) break;
            low = Math.max(low, 0);
        }
        return low == 0;
    }

    public static void main(String[] args) {
        String s3 = "(*))";
        boolean res = checkValidString(s3);
        System.out.println(res);
    }
}
