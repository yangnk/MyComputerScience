package algorithms.leetcode.lc0611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{0});
        System.out.printf(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        //为0
        if (digits[0] == 0) {
            list.add(1);
        } else {
            //转换我int进行+1计算
            String digitsOldStr = "";
            for (int i = 0; i < digits.length; i++) {
                digitsOldStr += digits[i];
            }
            int digitsInt = Integer.valueOf(digitsOldStr).intValue() + 1;

            //计算后转化为int[]
            String digistsNewStr = String.valueOf(digitsInt);
            for (int i = 0; i < digistsNewStr.length(); i++) {
                list.add(Integer.valueOf(String.valueOf(digistsNewStr.charAt(i))));
            }
        }
        Integer[] integerArr = new Integer[list.size()];
        list.toArray(integerArr);
        int[] intArr = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
        return intArr;
    }

}