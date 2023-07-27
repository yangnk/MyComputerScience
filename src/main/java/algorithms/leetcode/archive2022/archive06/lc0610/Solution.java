package algorithms.leetcode.lc0610;

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch = (char) (32 | ch);
                sb.append((char) (ch | 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "qweQWE";
        String lowerCase = str.toLowerCase();
//        System.out.println(lowerCase);
        System.out.println(66 | 32);
    }
}