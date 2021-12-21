package dataStructureAndAlgorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-09 07:36
 **/
public class BFSTree {
    void bfs(BFSTreeNode root) {
        Queue<BFSTreeNode> queue = new ArrayDeque<>();
        if (root == null) {
            return;
        }
        queue.offer(root);
        System.out.println(root.val);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                BFSTreeNode treeNode = queue.poll();
                System.out.println(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
        }
    }
}

class BFSTreeNode {
    int val;
    BFSTreeNode left;
    BFSTreeNode right;
    BFSTreeNode() {}
    BFSTreeNode(int val) { this.val = val; }
    BFSTreeNode(int val, BFSTreeNode left, BFSTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}