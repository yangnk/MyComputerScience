package dataStructureAndAlgorithms.leetcode.lc0611;

//https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumSwap(String s1, String s2) {
        //1.判断是否能够成功交互
        int xCount = 0;
        String str = s1 + s2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                xCount++;
            }
        }
        if (xCount % 2 != 0) {
            return -1;
        }
        //2.将相同的列去掉；
        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list1.add(s1.charAt(i));
            }
        }
        //3.两两分组；
        int xFirstCount = (int) list1.stream().filter(x -> x.equals('x')).count();
        int yFirstCount = (int) list1.stream().filter(x -> x.equals('y')).count();
        if (xFirstCount % 2 == 0) {
            return xFirstCount / 2 + yFirstCount / 2;
        } else {
            return xFirstCount / 2 + yFirstCount / 2 + 2;
        }
    }
}