package algorithms.algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BackTraceDemo {
    //递归先序遍历二叉树
    public static void preOrder(Node root) {
        Node p = root;
        if (p != null) {
            visit(p);
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    //非递归先序遍历遍历二叉树，利用stack
    public static void iterPreOrder(Node root) {
        Stack<Node> s = new Stack<>();
        if (root != null) {
            Node tmp = root;
            s.push(tmp);
            while (!s.isEmpty()) {
                tmp = s.pop();
                visit(tmp);
                if (tmp.right != null) {
                    s.push(tmp.right);
                }
                if (tmp.left != null) {
                    s.push(tmp.left);
                }
            }
        }
    }

    //广度遍历二叉树，利用queue
    public static void brendthTravar(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.offer(root);
            Node tmp = new Node();
            while (!q.isEmpty()) {
                tmp = q.poll();
                visit(tmp);
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }
                if (tmp.right != null) {
                    q.offer(tmp.right);
                }
            }
        }

    }

    public static void visit(Node p) {
        System.out.print(p.ele + " ");
    }

    public static void main(String[] args) {
        //构建树
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');
        Node g = new Node('g');
        Node b = new Node('b', d, e);
        Node c = new Node('c', f, g);
        Node a = new Node('a', b, c);
        Tree bTree = new Tree(a);
        System.out.print("递归先序遍历：");
        preOrder(bTree.root);
        System.out.println();
        System.out.print("非递归先序遍历：");
        iterPreOrder(bTree.root);
        System.out.println();
        System.out.print("广度遍历：");
        brendthTravar(bTree.root);
        System.out.println();

    }
}

class Node {
    char ele;
    Node left = null;
    Node right = null;

    public Node() {
    }

    public Node(char ele) {
        this.ele = ele;
    }

    public Node(char ele, Node left, Node right) {
        this.ele = ele;
        this.left = left;
        this.right = right;
    }
}

class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }
}
