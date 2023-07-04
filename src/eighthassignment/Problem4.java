package eighthassignment;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Problem4 {
    public static TreeNode str2tree(String s) {
        if (s == null || s.length() == 0) return null;
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '-') {
                int j = i;
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) i++;
                TreeNode curr = new TreeNode(Integer.parseInt(s.substring(j, i + 1)));
                if (stack.isEmpty()) stack.push(curr);
                else {
                    TreeNode parent = stack.peek();
                    if (parent.left == null) parent.left = curr;
                    else parent.right = curr;
                    stack.push(curr);
                }
            }
            if (s.charAt(i) == ')') stack.pop();
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";
        TreeNode res = str2tree(s);
        System.out.println(res);
    }
}
