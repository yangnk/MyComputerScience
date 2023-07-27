package algorithms.leetcode.archive01;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.titleToNumber("FXSHRXW");
        System.out.println(a);

    }

    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        char[] chars = columnTitle.toCharArray();
        int curNum;
        int ans = 0;
        for (int i = len - 1; i >= 0; i--) {
            curNum = chars[i] - 'A' + 1;
            ans += curNum * Math.pow(26, len - i - 1);
        }
        return ans;
    }
}
