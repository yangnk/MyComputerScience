package dataStructureAndAlgorithms.leetcode.lc0315;

import java.util.*;


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //树为null
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        //初始化
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> itemList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode item = queue.poll();
                if (item.left != null) {
                    queue.offer(item.left);
                }
                if (item.right != null) {
                    queue.offer(item.right);
                }
                itemList.add(item.val);
            }
            result.add(itemList);
        }
        return result;
    }
}
