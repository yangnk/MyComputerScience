//package algorithms.leetcode.archive2022.archive08.lc0827;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//
//public class Solution {
//    public int maxDepth(TreeNode root) {
//        return getMaxDepth(root);//
//    }
//
//    private int getMaxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = getMaxDepth(root.left);
//        int right = getMaxDepth(root.right);
//        return Math.max(left, right) + 1;
//    }
//}
