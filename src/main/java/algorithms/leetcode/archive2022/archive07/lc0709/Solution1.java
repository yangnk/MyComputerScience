//package dataStructureAndAlgorithms.leetcode.lc0709;
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
//public class LUPrefix {
//    /**
//     *
//     * @param root1 TreeNode类
//     * @param root2 TreeNode类
//     * @return TreeNode类
//     */
//    public TreeNode mergeTrees (TreeNode root1, TreeNode root2) {
//        if (root1 == null) {
//            return root2;
//        }
//        dfs(root1, root2);
//        return root1;
//    }
//
//    //先序遍历
//    private TreeNode dfs(TreeNode root1, TreeNode root2) {
//        if (root1 != null && root2 != null) {
//            root1.val += root2.val;
//        } else if (root1 == null) {
//            return root2;
//        } else if (root2 == null) {
//            return null;
//        }
//
//        TreeNode node1 = dfs(root1.left, root2.left);
//        if (node1 != null) {
//            root1.left = node1;
//        }
//
//        TreeNode node = dfs(root1.right, root2.right);
//        if (node != null) {
//            root1.right = node;
//        }
//        return null;
//    }
//}