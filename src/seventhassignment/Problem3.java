package seventhassignment;

public class Problem3 {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            carry = sum / 10;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String res = addStrings(num1, num2);
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + res);
    }
}
