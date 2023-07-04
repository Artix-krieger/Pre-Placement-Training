package eighthassignment;

public class Problem8 {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            // If we have 2 same characters in string 's',
            // we can swap them and still the strings will remain equal.
            int[] frequency = new int[26];
            for (char ch : s.toCharArray()) {
                frequency[ch - 'a'] += 1;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
            // Otherwise, if we swap any two characters, it will make the strings unequal.
            return false;
        }

        int p1 = -1;
        int p2 = -1;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (p1 == -1) p1 = i;
                else if (p2 == -1) p2 = i;
                // We have at least 3 indices with different characters,
                // thus, we can never make the strings equal with only one swap.
                else return false;
            }
        }
        // We can't swap if the character at only one index is different.
        if (p2 == -1) return false;

        // All characters of both strings are the same except two indices.
        return s.charAt(p1) == goal.charAt(p2) && s.charAt(p2) == goal.charAt(p1);
    }

    public static void main(String[] args) {
        String s = "abcd", goal = "badc";
        boolean res = buddyStrings(s, goal);
        System.out.println(res);
    }
}
