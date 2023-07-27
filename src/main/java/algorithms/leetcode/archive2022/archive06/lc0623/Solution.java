//package dataStructureAndAlgorithms.leetcode.lc0623;
//
//import java.util.*;
//
//
//class ListNode {
//  int val;
//  ListNode next = null;
//  public ListNode(int val) {
//    this.val = val;
//  }
//}
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param pHead ListNode类
//     * @param k int整型
//     * @return ListNode类
//     */
//    public ListNode FindKthToTail (ListNode pHead, int k) {
//        if (pHead == null || k == 0) {
//            return null;
//        }
//
//        ListNode slow = pHead;
//        ListNode fast = pHead;
//
//        for (int i = 1; i < k; i++) {
//            fast = fast.next;
//            if (fast == null) {
//                return null;
//            }
//        }
//
//        while (fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//    }
//}