package algorithms.oj.others;

//标题
//        合并两个有序链表
//
//        题目描述
//        将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。


public class Solution1 {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // String str=input.next();
        System.out.println("hello world");
    }

    public Node sortList(Node a, Node b) {
        //1->3->6  2->4->5

        Node rootA = new Node();
        rootA.next = a;
        Node rootB = new Node();
        rootB.next = b;

        Node ptrA = a;
        Node ptrB = b;

        Node tmp;
        //需要判断a，b是否为null
        if (a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        //需要确定头结点
        Node res;
        if (ptrA.val < ptrB.val) {
            res = rootA;
        } else {
            res = rootB;
        }
        while (ptrA.next != null && ptrB.next != null) {
            if (ptrA.val < ptrB.val) {
                tmp = ptrA.next;
                ptrA.next = ptrB;
                ptrA = tmp;
            } else {
                tmp = ptrB.next;
                ptrB.next = ptrA;
                ptrB = tmp;
            }
        }
        if (ptrA.next == null) {
            ptrA.next = ptrB;
        } else {
            ptrB.next = ptrA;
        }
        return res;
    }
}
