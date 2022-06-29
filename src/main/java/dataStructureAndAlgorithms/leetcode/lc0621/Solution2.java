//package dataStructureAndAlgorithms.leetcode.newCoder.nc0621;
//
//
////定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
////
////         
////
////        示例:
////
////        输入: 1->2->3->4->5->NULL
////        输出: 5->4->3->2->1->NULL
////         
////
////        限制：
////
////        0 <= 节点个数 <= 5000
//
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
//
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode cur = dummy.next;
//        while (cur.next != null) {
//            ListNode curNext = cur.next;
//            cur.next = curNext.next;
//            curNext.next = dummy.next;
//            dummy.next = curNext;
//        }
//        return dummy.next;
//    }
//}