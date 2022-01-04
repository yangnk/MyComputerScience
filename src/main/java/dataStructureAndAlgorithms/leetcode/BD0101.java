//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2022-01-01 21:47
// **/
//
//
////Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//
//public class BD0101 {
//
//
//
////    public ListNode detectCycle(ListNode head) {
////        if (head == null || head.next == null) {
////            return null;
////        }
////        int isExistCyclePre = 0;
////        int isExistCycleCurr = 0;
////        if (isExistCycle(head) == 0) {
////            return null;
////        }else {
////            while (head != null) {
////                isExistCycleCurr = isExistCycle(head);
////                if (isExistCycleCurr == 0) {
////                    return head;
////                }
////                isExistCyclePre = isExistCycleCurr;
////                head = head.next;
////            }
////            return null;
////        }
////
////
////    }
////
////    public int isExistCycle(ListNode head) {
////        if (head == null || head.next == null) {
////            return 0;
////        }
////        ListNode slow = head;
////        ListNode fast = head.next;
////        int isExistCycle = 0;
////        while (true) {
////            if (fast == slow) {
////                isExistCycle = 1;
////                break;
////            }
////            if (slow.next != null && fast.next != null && fast.next.next != null) {
////                slow = slow.next;
////                fast = fast.next.next;
////                continue;
////            }
////            isExistCycle = 0;
////            break;
////        }
////        return isExistCycle;
////    }
//}
