package algorithms.leetcode.archive2022.archive07.lc0731;

//递归写法
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    String startStr;
    String endStr;
    public String getDirections(TreeNode root, int startValue, int destValue) {

        TreeNode newRoot = root;
        startStr = reserveTree(newRoot, startValue, "", startStr);
        endStr = reserveTree(newRoot, destValue, "", endStr);
        int index = 0;
        while (index < startStr.length() && index < endStr.length()) {
            if (startStr.charAt(index) != endStr.charAt(index)) {
                break;
            }
            index++;
        }
        String s = startStr.substring(index, startStr.length()).replace("[LR]", "U");
        String s1 = endStr.substring(index, endStr.length());
        return s + s1;
    }

    private String reserveTree(TreeNode root, int value, String s, String result) {
        if (result != null || !result.equals("")) {
            return result;
        }
        if (root == null) {
            return "";
        }
        if (root.val == value) {
            result = s;
            return result;
        }
        if (root.left != null) {
            s += "L";
            result = reserveTree(root.left, value, s, result);
        }
        if (root.right != null) {
            s += "R";
            result = reserveTree(root.right, value, s, result);
        }
        s = s.substring(0, s.length() - 1);
        return result;
    }
}
