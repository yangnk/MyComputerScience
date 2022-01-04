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

    public List<List<Integer>> levelOrder(TreeNod1230 root) {
        Queue<TreeNod1230> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNod1230 treeNod1230 = queue.poll();
                integerList.add(treeNod1230.val);
                if (treeNod1230.left != null) {
                    queue.offer(treeNod1230.left);
                }
                if (treeNod1230.right != null) {
                    queue.offer(treeNod1230.right);
                }
            }
            result.add(integerList);
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNod1230 left;
    TreeNod1230 right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNod1230 left, TreeNod1230 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}