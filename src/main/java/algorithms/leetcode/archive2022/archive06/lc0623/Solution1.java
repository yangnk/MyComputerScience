//package dataStructureAndAlgorithms.leetcode.lc0623;
//
//import java.util.*;
//
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//public class Singleton {
//
//    public ListNode EntryNodeOfLoop(ListNode pHead) {
//        if (pHead == null ) {
//            return null;
//        }
//
//        Set<ListNode> set = new HashSet<>();
//        while (pHead != null) {
//            if (set.contains(pHead)) {
//                return pHead;
//            }
//            if (pHead.next == pHead) {
//                return pHead;
//            }
//            set.add(pHead);
//            pHead = pHead.next;
//        }
//        return null;
//    }
//}