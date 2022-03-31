package dataStructureAndAlgorithms.leetcode.lc0326;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode left, TreeNode right) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (left == null && right == null) {
            return true;
        }
        //至少left和right有一只非null
        queue.offer(left);
        queue.offer(right);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            queue.offer(q.left);
            queue.offer(p.right);
            queue.offer(q.right);
            queue.offer(p.left);
        }
        return true;
    }
}

//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        return isEqual(root.left, root.right);
//    }
//
//    //比较left和right子树是否相等
//    public boolean isEqual(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//        if (left == null || right == null) {
//            return false;
//        }
//        if (left.val != right.val) {
//            return false;
//        }
//        boolean outEqual = isEqual(left.left, right.right);
//        boolean inEqual = isEqual(left.right, right.left);
//        return outEqual && inEqual;
//    }
//}
