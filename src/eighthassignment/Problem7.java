package eighthassignment;

import java.util.Stack;

public class Problem7 {
    public static String decodeString(String s) {
        if (s.length() == 0) return s;

        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int num = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    num = num * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                numStack.push(num);
            } else if (s.charAt(idx) == '[') {
                strStack.push(res.toString());
                res = new StringBuilder(" ");
                idx++;
            } else if (s.charAt(idx) == ']') {
                StringBuilder temp = new
                        StringBuilder(strStack.pop());
                int repeatTimes = numStack.pop();
                temp.append(String.valueOf(res).repeat(Math.max(0, repeatTimes)));
                res = temp;
                idx++;
            } else {
                res.append(s.charAt(idx++));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        String res = decodeString(s);
        System.out.println(res  );
    }
}
