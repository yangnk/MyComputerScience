package dataStructureAndAlgorithms.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-09 07:49
 **/
public class LevelOrder1209 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode treeNode = queue.poll();
                integerList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(integerList);
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}