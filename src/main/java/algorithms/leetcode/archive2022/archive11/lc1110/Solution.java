package algorithms.leetcode.archive2022.archive11.lc1110;

class Solution {
    public String addBinary(String a, String b) {
        int dif = Math.abs(a.length() - b.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dif; i++) {
            sb.append("0");
        }
        if (a.length() > b.length()) {
            b = sb + b;
        } else {
            a = sb + a;
        }

        StringBuilder res = new StringBuilder();
        int carry = 0;
        for (int i = a.length(); i >= 0; i--) {
            int ai = a.charAt(i) - '0';
            int bi = b.charAt(i) - '0';
            if (ai + bi == 0) {
                res.append(carry);
                carry = 0;
            } else if (ai + bi == 1) {
                if (carry == 1) {
                    res.append(0);
                } else {
                    res.append(1);
                    carry = 0;
                }
            } else {
                res.append(carry);
                carry = 1;
            }
        }
        if (carry == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
