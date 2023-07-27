package dataStructureAndAlgorithms.leetcode.lc0524;

import java.util.HashSet;
import java.util.Set;

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
    Set<Integer> set = new HashSet<>();
    boolean result = true;

    public boolean isUnivalTree(TreeNode root) {
        set.add(root.val);
        travelTree(root);
        return result;
    }

    private void travelTree(TreeNode root) {
        //退出条件
        if (root == null) {
            return;
        }

        //处理
        if (!set.contains(root.val)) {
            result = false;
            return;
        }

        //递归
        travelTree(root.left);
        travelTree(root.right);
    }
}