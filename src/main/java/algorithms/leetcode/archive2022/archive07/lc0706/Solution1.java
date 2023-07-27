package dataStructureAndAlgorithms.leetcode.lc0706;

class Solution1 {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));

    }

    public static String replaceDigits(String s) {
        if (s.length() <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        int index = 1;
        while (index < len) {
            char num = s.charAt(index);
            char letter = s.charAt(index - 1);
            char c = (char) (letter + num - '0');
            sb.replace(index, index + 1, String.valueOf(c));
            index += 2;
        }
        return new String(sb);
    }
}
