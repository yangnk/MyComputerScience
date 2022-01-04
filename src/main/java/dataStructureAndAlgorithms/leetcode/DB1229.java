//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2021-12-29 17:05
// **/
//
////https://leetcode-cn.com/problems/add-two-numbers/
//
////Definition for singly-linked list.
//class ListNode1229 {
//    int val;
//    ListNode1229 next;
//    ListNode1229() {}
//    ListNode1229(int val) { this.val = val; }
//    ListNode1229(int val, ListNode1229 next) { this.val = val; this.next = next; }
//}
//
//public class DB1229 {
//
//    public ListNode1231a addTwoNumbers(ListNode1231a l1, ListNode1231a l2) {
//        //有一方为[0]情况
//        ListNode1231a tail = null;
//        ListNode1231a head = null;
//
//        int carry = 0;
//
//        while (l1 != null || l2 != null) {
//
//            //后面pointer指针移动
//            int l1Val = l1 == null ? 0 : l1.val;
//            int l2Val = l2 == null ? 0 : l2.val;
//            int sum = l1Val + l2Val + carry;
//
//            ListNode1231a newNode = null;
//            //第一次进来
//            if (head == null) {
//                head = tail = new ListNode1231a(sum % 10);
//            }else {
//                tail.next = new ListNode1231a(sum % 10);
//                tail = tail.next;
//            }
//            carry = sum / 10;
//
//            if (l1 != null) {
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                l2 = l2.next;
//            }
//        }
//        if (carry == 1) {
//            tail.next = new ListNode1231a(1);
//        }
//        return head;
//    }
//}
