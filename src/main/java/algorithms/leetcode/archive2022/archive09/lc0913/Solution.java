package algorithms.leetcode.archive2022.archive09.lc0913;

import java.util.LinkedList;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        LinkedList<Node> treeDeque = new LinkedList();
        int count = 0;
        treeDeque.addLast(root);
        count++;
        while (!treeDeque.isEmpty()) {
            int levelCount = 0;
            Node pre = treeDeque.pollFirst();
            count--;
            if (pre.left != null) {
                treeDeque.addLast(pre.left);
                levelCount++;
            }
            if (pre.right != null) {
                treeDeque.addLast(pre.right);
                levelCount++;
            }
            while (--count >= 0) {
                Node cur = treeDeque.pollFirst();
                if (cur.left != null) {
                    treeDeque.addLast(cur.left);
                    levelCount++;
                }
                if (cur.right != null) {
                    treeDeque.addLast(cur.right);
                    levelCount++;
                }
                pre.next = cur;
                pre = cur;
            }
            count = levelCount;
        }
        return root;
    }


//    public Node connect(Node root) {
//        if (root == null) {
//            return root;
//        }
//        LinkedList<Node> treeDeque = new LinkedList();
//        LinkedList<Node> levelDeque = new LinkedList();
//        int count = 0;
//        treeDeque.addLast(root);
//        count++;
//        while (!treeDeque.isEmpty()) {
//            int levelCount = 0;
//            while (--count >= 0) {
//                Node cur = treeDeque.pollFirst();
//                levelDeque.addLast(cur);
//                if (cur.left != null) {
//                    treeDeque.addLast(cur.left);
//                    levelCount++;
//                }
//                if (cur.right != null) {
//                    treeDeque.addLast(cur.right);
//                    levelCount++;
//                }
//            }
//            count = levelCount;
//            Node pre = levelDeque.pollFirst();
//            pre.next = null;
//            while (!levelDeque.isEmpty()) {
//                Node cur = levelDeque.pollFirst();
//                pre.next = cur;
//                pre = cur;
//            }
//        }
//        return root;
//    }
}