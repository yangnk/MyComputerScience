package dataStructureAndAlgorithms.leetcode.lc0706;

/**
 * @author yangningkai
 * @create 2022-07-06 11:46
 **/

public class Solution {
    public static void main(String[] args) {
        System.out.println(divide(2));
    }
    static String divide(int num) {
        StringBuffer sb = new StringBuffer();
        int a = 2;
        while (num > 1) {
            if (num % a == 0) {
                num /= a;
                sb.append(a);
                a = 2;
                continue;
            }else {
                a++;
            }
        }
        return new String(sb);
    }
}
