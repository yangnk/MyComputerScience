//package dataStructureAndAlgorithms.leetcode.lc0625;
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
//     * @param head ListNode类 the head node
//     * @return ListNode类
//     */
//    public ListNode sortInList (ListNode head) {
//        // 1.对比cur和已排序好列表，找到位置；
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//
//        ListNode cur = dummy.next;
//        ListNode pre = dummy.next;
//        ListNode tail = dummy.next;
//
//        while (cur != null) {
//            //二次循环，找到合适的位置插入
//            while (pre != tail) {
//                pre = pre.next;
//                if (pre.val < cur.val) {
//                    continue;
//                }
//                //2.插入到位置中；
//                ListNode curNext = cur.next;
////                cur.next = pre.next;
//                tail.next = curNext;
//                cur.next = pre.next;
//                pre.next = cur;
//
//            }
//
//        }
//    }
//}