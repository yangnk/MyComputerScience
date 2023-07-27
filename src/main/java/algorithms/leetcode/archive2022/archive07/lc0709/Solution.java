//package dataStructureAndAlgorithms.leetcode.lc0709;
//
//
//import java.util.*;
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
////只有前序/后序和先序一样才能确定树一样
//public class Solution {
//
//    boolean isSymmetrical(TreeNode pRoot) {
//        if (pRoot == null) {
//            return true;
//        }
//        return dfs(pRoot.left, pRoot.right);
//    }
//
//    private boolean dfs(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//        if (left == null || right == null || left.val != right.val) {
//            return false;
//        }
//        return dfs(left.left, right.right) && dfs(left.right, right.left);
//    }
//
//
////    boolean isSymmetrical(TreeNode pRoot) {
////        if (pRoot == null) {
////            return true;
////        }
////        List<Integer> list1 = new ArrayList<>();
////        List<Integer> list2 = new ArrayList<>();
////        dfs1(pRoot.left, list1);
////        dfs2(pRoot.right, list2);
////
////        List<Integer> list1a = new ArrayList<>();
////        List<Integer> list2a = new ArrayList<>();
////        dfs1a(pRoot.left, list1a);
////        dfs2a(pRoot.right, list2a);
////
////        return list1.equals(list2) && list1a.equals(list2a);
////    }
////
////    private void dfs1(TreeNode root, List<Integer> list) {
////        if (root == null) {
////            return;
////        }
////        dfs1(root.left, list);
////        list.add(root.val);
////        dfs1(root.right, list);
////    }
////
////    private void dfs1a(TreeNode root, List<Integer> list) {
////        if (root == null) {
////            return;
////        }
////        list.add(root.val);
////        dfs1a(root.left, list);
////        dfs1a(root.right, list);
////    }
////
////    private void dfs2(TreeNode root, List<Integer> list) {
////        if (root == null) {
////            return;
////        }
////        dfs2(root.right, list);
////        list.add(root.val);
////        dfs2(root.left, list);
////    }
////
////    private void dfs2a(TreeNode root, List<Integer> list) {
////        if (root == null) {
////            return;
////        }
////        list.add(root.val);
////        dfs2a(root.right, list);
////        dfs2a(root.left, list);
////    }
//}
