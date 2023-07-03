package seventhassignment;


public class Problem7 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.length() == 0) return true;

        search:
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt((j + i) % s.length()) != goal.charAt(i))
                    continue search;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        boolean res = rotateString(s, goal);
        System.out.println(res);
    }
}
