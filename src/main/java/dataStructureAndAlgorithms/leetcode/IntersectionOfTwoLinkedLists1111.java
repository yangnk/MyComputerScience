//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-11-12 00:10
// **/
//public class IntersectionOfTwoLinkedLists1111 {
//    public ListNode1231a getIntersectionNode(ListNode1231a headA, ListNode1231a headB) {
//        Set<ListNode1231a> mySet = new HashSet<ListNode1231a>();
//        ListNode1231a tmpA = headA;
//
//        while(tmpA != null){
//            mySet.add(tmpA);
//            tmpA = tmpA.next;
//        }
//
//        ListNode1231a tmpB = headB;
//        while (tmpB != null) {
//            if (mySet.contains(tmpB)) {
//                return tmpB;
//            }
//            tmpB = tmpB.next;
//        }
//        return null;
//    }
//}
//
//  class ListNode1231a {
//      int val;
//      ListNode1231a next;
//      ListNode1231a(int x) {
//          val = x;
//          next = null;
//      }
//  }
//
