//package dataStructureAndAlgorithms.leetcode.lc0707;
//
//import java.util.*;
//
//
//class TreeNode {
//  int val = 0;
//  TreeNode left = null;
//  TreeNode right = null;
//}
//
//
//public class Solution2 {
//    /**
//     *
//     * @param root TreeNode类
//     * @param sum int整型
//     * @return bool布尔型
//     */
//    Stack<TreeNode> stack = new Stack<>();
//    int targetSum = 0;//
//    int curSum = 0;
//    boolean flag = false;
//
//    public boolean hasPathSum (TreeNode root, int sum) {
//        if (root == null) {
//            return false;
//        }
//        targetSum = sum;
//        stack.push(root);
//        travel(root);
//        return flag;
//    }
//
//    private void travel(TreeNode root) {
//        if (root == null || flag == true) {
//            return;
//        }
//        curSum += root.val;
//        stack.push(root);
//        travel(root.left);
//        travel(root.right);
//        if (curSum == targetSum && root.left == null && root.right == null) {
//            flag = true;
//        }
//        TreeNode node = stack.pop();
//        curSum -= node.val;
//    }
//}