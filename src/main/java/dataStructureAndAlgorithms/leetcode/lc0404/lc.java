//package dataStructureAndAlgorithms.leetcode.lc0404;
//
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
////class Solution {
////    public ListNode deleteDuplicates(ListNode head) {
////        if (head == null) {
////            return null;
////        }
////
////        TreeSet<Integer> treeSet = new TreeSet<>();
////        while (head != null) {
////            treeSet.add(head.val);
////            head = head.next;
////        }
////        ListNode dummyHead = new ListNode();
////        ListNode newHead = null;
////        dummyHead.next = newHead;
////        for (Integer i : treeSet) {
////            ListNode tmp = new ListNode(i);
////            newHead.next = tmp;
////            newHead = tmp;
////        }
////        return dummyHead.next;
////
////    }
////}
//
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        //空list
//        if (head == null) {
//            return null;
//        }
//
//        ListNode dummyHead = new ListNode();
//        dummyHead.next = head;
//
//        ListNode first = head;
//        ListNode last = head;
//
//        while (true) {
//            //处理重复元素
//            while (last.next != null) {
//                last = last.next;
//                if (first.val == last.val) {
//                    continue;
//                } else {
//                    //复位
//                    first.next = last;
//                    first = last;
//                }
//            }
//            //last指向最后一个元素
//            if (first.val == last.val) {
//                first.next = null;
//                break;
//            } else {
//                break;
//            }
//        }
//        return dummyHead.next;
//    }
//}