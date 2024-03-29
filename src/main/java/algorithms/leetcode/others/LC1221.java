//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-21 23:42
// **/
//
////Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode1231a next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode1231a next) { this.val = val; this.next = next; }
//}
//
//public class LC1221 {
//    public static void main(String[] args) {
//        int[] list1 = new int[]{1, 2, 4};
//        int[] list2 = new int[]{1, 3, 4};
////        System.out.println(mergeTwoLists(list1, list2).toString());
//    }
//    public static ListNode1231a mergeTwoLists(ListNode1231a list1, ListNode1231a list2) {
//        ListNode1231a listPointer1 = list1;
//        ListNode1231a listPointer2 = list2;
//        ListNode1231a resultPointer = new ListNode1231a();
//        ListNode1231a root = resultPointer;
//
//        while (true) {
//            ListNode1231a newNode = new ListNode1231a();
//            if (resultPointer.next == null) {
//                root = resultPointer;
//            }
//            if (listPointer1 == null) {
//                resultPointer.next = listPointer2;
//                break;
//            }
//            if (listPointer2 == null) {
//                resultPointer.next = listPointer1;
//                break;
//            }
//            resultPointer.next = newNode;
//            int a = listPointer1.val < listPointer2.val ? 1 : 2;
//            if (a == 1) {
//                newNode.val = listPointer1.val;
//                listPointer1 = listPointer1.next;
//            }
//            if (a == 2) {
//                newNode.val = listPointer2.val;
//                listPointer2 = listPointer2.next;
//            }
//        }
//        return root;
//    }
//
//    public ListNode1231a mergeTwoListsNew(ListNode1231a list1, ListNode1231a list2) {
//        ArrayList<Integer> arrayList = new ArrayList();
//        if (list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//        while (list1 != null) {
//            arrayList.add(list1.val);
//            list1 = list1.next;
//        }
//        while (list2 != null) {
//            arrayList.add(list2.val);
//            list2 = list2.next;
//        }
//        Collections.sort(arrayList);
//
//        ListNode1231a root = new ListNode1231a();
//        ListNode1231a pointer = null;
//        pointer = root;
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (i == 0) {
//                pointer.val = arrayList.get(i);
//                continue;
//            }
//            ListNode1231a newNode = new ListNode1231a();
//            newNode.val = arrayList.get(i);
//            pointer.next = newNode;
//            pointer = newNode;
//        }
//        return root;
//    }
//}
