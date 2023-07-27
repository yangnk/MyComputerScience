package algorithms.leetcode.archive2022.archive09.lc0906;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        int count = 1;
        int flag = 1;//奇数向右->，偶数向左<-
        while (!deque.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int newCount = 0;
            LinkedList<TreeNode> stack = new LinkedList<>();
            //层次遍历
            if (flag % 2 == 1) {
                while (--count >= 0) {
                    TreeNode node = deque.pollFirst();
                    item.add(node.val);
                    if (node.left != null) {
                        deque.addLast(node.left);
                        newCount++;
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                        newCount++;
                    }
                }
            } else{
                while (--count >= 0) {
                    TreeNode node = deque.pollFirst();
                    stack.push(node);
                    if (node.left != null) {
                        deque.addLast(node.left);
                        newCount++;
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                        newCount++;
                    }
                }
                while (!stack.isEmpty()) {
                    item.add(stack.poll().val);
                }
            }
            flag++;
            count = newCount;
            res.add(item);
        }
        return res;
    }
}
