package algorithms.leetcode.archive04.a0415;


import java.util.*;

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

public class Solution2 {
    public TreeNode replaceValueInTree(TreeNode root) {
//        TreeNode resRoot = new TreeNode(0, null, null);
        TreeNode ptr = root;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        root.val = 0;
        while (true) {//todo
            int len = queue.size();
//            Map<TreeNode, List<Integer>> listList = new HashMap<>();
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode first = queue.poll();
                list.add(first);
                if (first.left != null) {
                    queue.addLast(first.left);
                }
                if (first.right != null) {
                    queue.addLast(first.right);
                }
            }
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).left != null) {
                        sum += list.get(i).left.val;
                        }
                    if (list.get(i).right != null) {
                        sum += list.get(i).right.val;
                        }
                    }
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).left != null&&list.get(i).right != null) {
                        sum -= list.get(i).left.val;
                        sum -= list.get(i).right.val;
                        list.get(i).left.val = sum;
                        list.get(i).right.val = sum;
                    }else if (list.get(i).left != null) {
                        sum -= list.get(i).left.val;
                        list.get(i).left.val = sum;
                    }else if (list.get(i).right != null) {
                        sum -= list.get(i).right.val;
                        list.get(i).right.val = sum;
                    }
                }
        }
    }
}
