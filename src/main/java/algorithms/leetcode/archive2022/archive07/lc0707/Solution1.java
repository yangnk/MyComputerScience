//package dataStructureAndAlgorithms.leetcode.lc0707;
//
//import java.util.*;
//
//class TreeNode {
//  int val = 0;
//  TreeNode left = null;
//  TreeNode right = null;
//}
//
//
//public class Singleton {
//    /**
//     *
//     * @param root TreeNode类
//     * @return int整型
//     */
//    Stack<TreeNode> stack = new Stack<>();
//    int maxDepth = 1;
//    public int maxDepth (TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        stack.push(root);
//        travel(root);
//        return maxDepth - 1;
//    }
//
//    private void travel(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        stack.push(root);
//        travel(root.left);
//        travel(root.right);
//        maxDepth = stack.size() > maxDepth ? stack.size() : maxDepth;
//        stack.pop();
//    }
//}