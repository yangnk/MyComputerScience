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
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//public class BD1223 {
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        while (head != null) {
//            arrayList.add(head.val);
//            head = head.next;
//        }
//        Collections.reverse(arrayList);
//        ListNode root = null;
//        ListNode tail = null;
//        root = tail;
//        for (int i = 0; i < arrayList.size(); i++) {
//            ListNode ListNode = new ListNode();
//            if (i == 0) {
//                ListNode.val = arrayList.get(0);
//                root = ListNode;
//                tail = ListNode;
//                continue;
//            }
//            ListNode.val = arrayList.get(i);
//            tail.next = ListNode;
//            tail = ListNode;
//        }
//        return root;
//    }
//    public ListNode reverseListV2(ListNode head) {
//        ListNode curr = head;
//        ListNode pre = null;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        return pre;
//    }
//}
