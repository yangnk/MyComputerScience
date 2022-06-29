//package dataStructureAndAlgorithms.leetcode.newCoder.nc0621;
//
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//class Solution1 {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (head == null || head.next == null || left == right) {
//            return head;
//        }
//
//        //虚拟头结点+头插法
//        ListNode dummyHead = new ListNode();
//        dummyHead.next = head;
//        ListNode pre = dummyHead;
//        ListNode cur = null;
//        int num = 1;
//
//        while (true) {
//            if (num == left) {
//                cur = pre.next;
//                for (int i = 0; i < right - left; i++) {
//                    ListNode curNext = cur.next;
//                    cur.next = curNext.next;
//                    curNext.next = pre.next;//curNext.next = cur 是否可以？
//                    pre.next = curNext;
//                }
//                break;
//            }
//            num++;
//            pre = pre.next;
//        }
//        return dummyHead.next;
//    }
//}