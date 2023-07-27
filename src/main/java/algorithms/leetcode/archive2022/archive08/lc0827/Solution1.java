//package algorithms.leetcode.archive2022.archive08.lc0827;
//
//
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
//public class LUPrefix {
//    public int minDepth(TreeNode root) {
//        return getMinDepth(root);
//    }
//
//    private int getMinDepth(TreeNode root) {
//        if (root == null) {
//            return 1;
//        }
//        int left = getMinDepth(root.left);
//        int right = getMinDepth(root.right);
//        if (root.left == null && root.right != null) {
//            return 1 + right;
//        }
//        if (root.right == null && root.left != null) {
//            return 1 + left;
//        }
//        return 1 + Math.min(left, right);
//    }
//}
