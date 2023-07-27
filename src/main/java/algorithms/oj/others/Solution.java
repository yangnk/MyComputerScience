package algorithms.oj.others;

public class Solution {
    public static void main(String[] args) {
        //构造链表
        Node node1 = new Node(1);
        Node node2 = new Node(9);
        Node node3 = new Node(8);
        Node node4 = new Node(8);
        Node node5 = new Node(6);
        Node node6 = new Node(4);
        Node node7 = new Node(6);
        Node node8 = new Node(3);
        Node node9 = new Node(8);
        Node node10 = new Node(9);
        Node node11 = new Node(5);
        Node node12 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;

        //删除倒数第四个值
        deleteLastval(node1, 4);
        //翻转链表
        Node newNode = operList(node1);

        while (newNode != null) {
            System.out.print(newNode.val+"->");
            newNode = newNode.next;
        }
    }

    private static Node operList(Node node1) {
        Node pre = new Node();
        pre.next = node1;
        Node cur = node1;
        Node next = node1.next;
        node1.next = null;
        while (next != null) {
            pre = cur;
            cur = next;
            next = next.next;
            cur.next = pre;
        }
        return cur;
    }

    private static void deleteLastval(Node node1, int i) {
        Node fast = node1;
        Node slow = node1;
        for (int j = 0; j <= i ; j++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }
}

class Node{
    int val;
    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
