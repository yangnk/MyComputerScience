package algorithms.leetcode.archive02.a0226;

//给你一个下标从 0 开始的字符串 word ，长度为 n ，由从 0 到 9 的数字组成。另给你一个正整数 m 。
//
//        word 的 可整除数组 div  是一个长度为 n 的整数数组，并满足：
//
//        如果 word[0,...,i] 所表示的 数值 能被 m 整除，div[i] = 1
//        否则，div[i] = 0
//        返回 word 的可整除数组。


import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
//        word = "998244353", m = 3

//        "998244353"
//        3
        String word = "998244353";
        int m = 3;
        int[] ints = divisibilityArray(word, m);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));


//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        StringBuilder stringBuilder = new StringBuilder("abcde");
//        stringBuilder.delete(1, 4);
//        stringBuilder.insert(1, "hhh");
//
//        System.out.println("stringBuilder = " + stringBuilder);


    }

    public static int[] divisibilityArray(String word, int m) {
        int[] ans = new int[word.length()];
        StringBuilder sb = new StringBuilder(word);
        int first = 0;

        for (int i = 0; i < word.length(); i++) {
            if (i + 1 - first < String.valueOf(m).length()) {
                ans[i] = 0;
                continue;
            }

            String substring = word.substring(first, i + 1);
            Integer integer = Integer.valueOf(substring);

            int mod = integer % m;
            if (mod == 0) {
                ans[i] = 1;
                first = i + 1;
            } else if (mod != 0) {
                ans[i] = 0;
                int len = String.valueOf(mod).length();
                sb.delete(i - len + 1, i + 1);
                sb.insert(i, mod);
                first = i - len + 1;
            }
        }
        return ans;

//        char[] chars = word.toCharArray();
//        int[] ans = new int[word.length()];
//        StringBuilder sb = new StringBuilder();
//        Integer integer = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//            sb.append(chars[i]);
//            integer = Integer.valueOf(sb.toString());
//            if (integer % m == 0) {
//                ans[i] = 1;
//            } else {
//                ans[i] = 0;
//            }
//        }
//        return ans;
    }
}
