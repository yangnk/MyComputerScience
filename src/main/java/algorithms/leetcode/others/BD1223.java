//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-23 23:01
// **/
//
////Definition for singly-linked list.
//class ListNode1231a {
//    int val;
//    ListNode1231a next;
//    ListNode1231a() {}
//    ListNode1231a(int val) { this.val = val; }
//    ListNode1231a(int val, ListNode1231a next) { this.val = val; this.next = next; }
//}
//
//public class BD1223 {
//    public ListNode1231a reverseList(ListNode1231a head) {
//        if (head == null) {
//            return null;
//        }
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        while (head != null) {
//            arrayList.add(head.val);
//            head = head.next;
//        }
//        Collections.reverse(arrayList);
//        ListNode1231a root = null;
//        ListNode1231a tail = null;
//        root = tail;
//        for (int i = 0; i < arrayList.size(); i++) {
//            ListNode1231a ListNode1231a = new ListNode1231a();
//            if (i == 0) {
//                ListNode1231a.val = arrayList.get(0);
//                root = ListNode1231a;
//                tail = ListNode1231a;
//                continue;
//            }
//            ListNode1231a.val = arrayList.get(i);
//            tail.next = ListNode1231a;
//            tail = ListNode1231a;
//        }
//        return root;
//    }
//    public ListNode1231a reverseListV2(ListNode1231a head) {
//        ListNode1231a curr = head;
//        ListNode1231a pre = null;
//        while (curr != null) {
//            ListNode1231a next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        return pre;
//    }
//}
