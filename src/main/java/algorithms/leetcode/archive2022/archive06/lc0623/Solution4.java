//package dataStructureAndAlgorithms.leetcode.lc0623;
//
//import java.util.*;
//
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
//     * @param n int整型
//     * @return ListNode类
//     */
//    public ListNode removeNthFromEnd (ListNode head, int n) {
//        if (head == null) {
//            return null;
//        }
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode fast = dummy;
//        ListNode slow = dummy;
//
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}