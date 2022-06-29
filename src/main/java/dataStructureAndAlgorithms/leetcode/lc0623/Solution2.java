//package dataStructureAndAlgorithms.leetcode.lc0623;
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
//class Solution2 {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//        if (lists.length == 1) {
//            return lists[0];
//        }
//        return divideList(lists, 0, lists.length - 1);
//    }
//
//    private ListNode divideList(ListNode[] lists, int left, int right) {
//        if (left == right) {
//            return lists[left];
//        }
//        int mid = left + (right - left) / 2;
//        return merge2List(divideList(lists, left, mid), divideList(lists, mid + 1, right));
//    }
//
//    private ListNode merge2List(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                cur.next = list1;
//                cur = cur.next;
//                list1 = list1.next;
//                cur.next = null;
//            } else {
//                cur.next = list2;
//                cur = cur.next;
//                list2 = list2.next;
//                cur.next = null;
//            }
//        }
//        cur.next = (list1 == null ? list2 : list1);
//        return dummy.next;
//    }
//}