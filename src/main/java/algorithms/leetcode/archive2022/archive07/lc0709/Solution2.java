//package dataStructureAndAlgorithms.leetcode.lc0709;
//
//import java.util.*;
//
//
//class TreeNode {
//  int val = 0;
//  TreeNode left = null;
//  TreeNode right = null;
//  public TreeNode(int val) {
//    this.val = val;
//  }
//}
//
//
//public class Solution2 {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param root TreeNode类
//     * @return TreeNode类
//     */
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        dfs(root);
//        return root;
//    }
//
//    private void dfs(TreeNode pRoot) {
//        if (pRoot == null) {
//            return;
//        }
//        dfs(pRoot.left);
//        dfs(pRoot.right);
//
//        TreeNode tmp = pRoot.left;
//        pRoot.left = pRoot.right;
//        pRoot.right = tmp;
//    }
//}