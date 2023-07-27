package dataStructureAndAlgorithms.leetcode.lc0707;

import java.util.*;


class Node {
 int val = 0;
 Node left = null;
 Node right = null;

 public Node(int val) {
 this.val = val;

 }

 }



public class Solution3 {

    Stack<Node> stack = new Stack<>();
    int count = 0;
    Node head;
    Node cur;
    Node next;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return new Node(0);
        }
        stack.push(root);
        dfs(root);
        return head;
    }

    private void dfs(Node root) {
        if (root == null) {
            count++;
            return;
        }
        stack.push(root);
        dfs(root.left);

        next = stack.pop();
        if (count == 1) {
            head = next;
            cur = next;
        } else {
            cur.right = next;
            next.left = cur;
            cur = next;
        }

        dfs(root.right);
    }
}