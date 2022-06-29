package dataStructureAndAlgorithms.leetcode.lc0531;
// Definition for a Node.

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        recursion(root, list);
        return list;
    }

    private void recursion(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);

        List<Node> children = root.children;
        for (Node item : children) {
            recursion(item, list);
        }
    }
}