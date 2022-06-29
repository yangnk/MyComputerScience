package dataStructureAndAlgorithms.leetcode.lc0601;




import java.util.*;


class ListNode {
  int val;
  ListNode next = null;
}

//总结：新增两个链表，一个保存比x小的，一个保存非比x小的，最后连起来
public class Solution {
    /**
     *
     * @param head ListNode类
     * @param x int整型
     * @return ListNode类
     */
    public ListNode partition (ListNode head, int x) {
        // write code here
        ListNode dummyNode1 = new ListNode();
        ListNode dummyNode2 = new ListNode();
        ListNode curr1 = dummyNode1;
        ListNode curr2 = dummyNode2;
        while (head != null) {
            if (head.val < x) {
                curr1.next = head;
                curr1 = curr1.next;
            } else {
                curr2.next = head;
                curr2 = curr2.next;
            }
            head = head.next;
        }
        curr2.next = null;
        curr1.next = dummyNode2.next;
        return dummyNode1.next;
    }
}



//
//import java.util.*;
//
//class ListNode {
//  int val;
//  ListNode next = null;
//}
//
//
//public class Solution {
//    /**
//     *
//     * @param head ListNode类
//     * @param x int整型
//     * @return ListNode类
//     */
//    public ListNode partition (ListNode head, int x) {
//
//        ListNode l1 = head;
//        while (l1 != null) {
//            System.out.println(l1.val);
//        }
//
//        // write code here
//        ListNode dummyHead = new ListNode();
//        ListNode dummyNewHead = new ListNode();
//        ListNode newCurr = dummyNewHead;
//        ListNode curr = dummyHead;
//
//        dummyHead.next = head;
//
//        while (curr.next != null) {
//            if (curr.next.val < x) {
//                newCurr.next = curr;
//                newCurr = curr;
//                curr.next = curr.next.next;
//            }else {
//                curr = curr.next;
//            }
//        }
//        //处理老head链表最后一个节点
//        if (curr.val < x) {
//            newCurr.next = curr;
//            curr = null;
//        }
//        //老head链表和新链表接起来
//        newCurr.next = dummyHead.next;
//        return dummyNewHead.next;
//    }
//}