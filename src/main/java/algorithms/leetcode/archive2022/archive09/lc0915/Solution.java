package algorithms.leetcode.archive2022.archive09.lc0915;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.convertToTitle(28);
        System.out.println(s);
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            ans.append((char) (columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return new String(ans.reverse());
    }
}
