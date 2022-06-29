package dataStructureAndAlgorithms.leetcode.lc0625;

import java.util.*;

class ListNode {
  int val;
  ListNode next = null;
}


public class Solutiona {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        //一个节点的链表返回
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head.next;
        ListNode fast = head.next;
        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = head;
        ListNode right = slow.next;
        slow.next = null;
        return mergeList(sortInList(left), sortInList(right));
    }

    private ListNode mergeList(ListNode p1, ListNode p2) {
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if(p1 != null) {
            p.next = p1;
        }
        if(p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

}
