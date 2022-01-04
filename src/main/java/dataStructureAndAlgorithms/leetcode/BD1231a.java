//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-31 00:14
// **/
//
//
//
////Definition for a binary tree node.
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
//public class BD1231a {
//    List<List<Integer>> listList = new ArrayList<>();
//    Stack<Integer> stack = new Stack<>();
//
//    public List<List<Integer>> pathSum(TreeNode root, int target) {
//        dfs(root, target);
//        return listList;
//    }
//
//    void dfs(TreeNode root, int target) {
//        if (root == null) {
//            return;
//        }
//        stack.push(root.val);
//        target -= root.val;
//        if (root.left == null && root.right == null && target == 0) {
//            listList.add(new ArrayList<>(stack));
//        }
//        dfs(root.left, target);
//        dfs(root.right, target);
//        stack.pop();
//    }
//}
