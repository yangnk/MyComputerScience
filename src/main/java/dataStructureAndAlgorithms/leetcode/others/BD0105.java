//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2022-01-05 00:03
// **/
//
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
//public class BD0105 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> nodeSet = new HashSet<>();
//        while (headA != null) {
//            nodeSet.add(headA);
//            headA = headA.next;
//        }
//        while (headB != null) {
//            if (nodeSet.contains(headB)) {
//                return headB;
//            }
//            headB = headB.next;
//        }
//        return null;
//    }
//}
