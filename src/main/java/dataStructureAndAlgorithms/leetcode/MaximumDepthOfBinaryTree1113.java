//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-11-13 22:59
// **/
//public class MaximumDepthOfBinaryTree1113 {
//    public int maxDepth(TreeNod1230 root) {
//        if (root == null) {
//            return 0;
//        }
//
//        int leftMaxDepth = maxDepth(root.left);
//        int rightMaxDepth = maxDepth(root.right);
//        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
//    }
//}
//
//
//
////Definition for a binary tree node.
//class TreeNod1230 {
//    int val;
//    TreeNod1230 left;
//    TreeNod1230 right;
//    TreeNod1230() {}
//    TreeNod1230(int val) { this.val = val; }
//    TreeNod1230(int val, TreeNod1230 left, TreeNod1230 right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
