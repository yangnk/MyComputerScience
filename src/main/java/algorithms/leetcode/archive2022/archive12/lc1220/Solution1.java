package algorithms.leetcode.archive2022.archive12.lc1220;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
//        String s = solution1.singleMulti("9871", '9');
//        System.out.println("s = " + s);

        String s = solution1.addRes("6888", "492", 2);
        System.out.println("s = " + s);
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String res = "0";
        for (int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(num2.length() - i - 1);
            String ans = singleMulti(num1, c);
            res = addRes(res, ans, i);
        }
        return res;
    }

    private String addRes(String res, String ans, int i) {
        for (int j = 0; j < i; j++) {
            ans += "0";
        }

        int carry = 0;
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < ans.length(); k++) {
            char c1 = ans.charAt(ans.length() - k - 1);
            char c2;
            if (k < res.length()) {
                c2 = res.charAt(res.length() - k - 1);
            } else {
                c2 = '0';
            }
            int ans1 = (c1 - '0') + (c2 - '0') + carry;
            carry = 0;
            if (ans1 >= 10) {
                carry = ans1 / 10;
                ans1 %= 10;
            }
            sb.append(ans1);
        }
        if (carry >= 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    private String singleMulti(String num1, char c) {

        int carry = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = num1.length() - 1; i >= 0; i--) {
            char c1 = num1.charAt(i);
            int ans = (c1 - '0') * (c - '0') + carry;
            carry = 0;
            if (ans >= 10) {
                carry = ans / 10;
                ans %= 10;
            }
            sb.append(ans);
        }
        if (carry >= 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
