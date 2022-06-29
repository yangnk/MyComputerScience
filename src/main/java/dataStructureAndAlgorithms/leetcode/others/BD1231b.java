//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-31 09:25
// **/
//
////https://leetcode-cn.com/explore/featured/card/bytedance/244/linked-list-and-tree/1040/
//
////Definition for singly-linked list.
//class ListNode1231b {
//    int val;
//    ListNode1231b next;
//    ListNode1231b() {}
//    ListNode1231b(int val) { this.val = val; }
//    ListNode1231b(int val, ListNode1231b next) { this.val = val; this.next = next; }
//}
//
//public class BD1231b {
//    public ListNode1231b sortList(ListNode1231b head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode1231b tail = head.next;
//        int headVal = head.val;
//        int tailVal = head.val;
//        while (tail != null) {
//            tailVal = tail.val > tailVal ? tail.val : tailVal;
//            ListNode1231b tailPtr = null;
//            ListNode1231b headPtr = null;
//            if (tail.val < head.val) {
//                tailPtr = tail;
//                tail = tail.next;
//                tailPtr.next = head;
//                head = tailPtr;
//            }else {
//                headPtr = head;
//                while (headPtr.next != null && headPtr.val < tail.val) {
//                    headPtr = headPtr.next;
//                }
//                tailPtr = tail;
//                tail = tail.next;
//                tailPtr.next = headPtr.next;
//                headPtr = tailPtr;
//            }
//        }
//    }
//}
//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-31 09:25
// **/
//
////https://leetcode-cn.com/explore/featured/card/bytedance/244/linked-list-and-tree/1040/
//
////Definition for singly-linked list.
//class ListNode1231b {
//    int val;
//    ListNode1231b next;
//    ListNode1231b() {}
//    ListNode1231b(int val) { this.val = val; }
//    ListNode1231b(int val, ListNode1231b next) { this.val = val; this.next = next; }
//}
//
//public class BD1231b {
//    public ListNode1231b sortList(ListNode1231b head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        }
//        ListNode1231b tail = head.next;
//        int headVal = head.val;
//        int tailVal = head.val;
//        while (tail != null) {
//            tailVal = tail.val > tailVal ? tail.val : tailVal;
//            ListNode1231b tailPtr = null;
//            ListNode1231b headPtr = null;
//            if (tail.val < head.val) {
//                tailPtr = tail;
//                tail = tail.next;
//                tailPtr.next = head;
//                head = tailPtr;
//            }else {
//                headPtr = head;
//                while (headPtr.next != null && headPtr.val < tail.val) {
//                    headPtr = headPtr.next;
//                }
//                tailPtr = tail;
//                tail = tail.next;
//                tailPtr.next = headPtr.next;
//                headPtr = tailPtr;
//            }
//        }
//    }
//}
