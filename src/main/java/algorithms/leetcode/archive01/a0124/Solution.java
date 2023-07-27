package algorithms.leetcode.archive01.a0124;

public class Solution {



    public boolean isCircularSentence(String sentence) {
        String[] strings = sentence.split("\\s");
        int len = strings.length;
        if (strings[0].charAt(0) != strings[len - 1].charAt(strings[len - 1].length() - 1)) {
            return false;
        }
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].charAt(strings[i].length() - 1) != strings[i + 1].charAt(0)) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        String str = "Leetcode is cool";
//        String[] split = str.split("\\s");
//        System.out.println();
//    }
}
