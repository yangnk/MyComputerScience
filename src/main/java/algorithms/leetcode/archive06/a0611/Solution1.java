package algorithms.leetcode.archive06.a0611;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String s = solution1.smallestString("a");
        System.out.println("s = " + s);
    }

    public String smallestString(String s) {
        int firstIndex = s.indexOf("a");
        if (firstIndex == -1) {
            return decrChar(s);
        }
        int secondIndex = s.indexOf("a", firstIndex + 1);
        if (firstIndex == 0) {
            if (secondIndex == -1) {
                return s.substring(0, 1) + decrChar(s.substring(1));
            } else {
                return s.substring(0, 1) + decrChar(s.substring(1, secondIndex)) + s.substring(secondIndex);
            }
        }else {
            return decrChar(s.substring(0, firstIndex)) + s.substring(firstIndex);
        }
    }

    private String decrChar(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'z') {
                chars[i] = 'a';
                continue;
            }
            chars[i] = --chars[i];
        }
        return new String(chars);
    }
}
