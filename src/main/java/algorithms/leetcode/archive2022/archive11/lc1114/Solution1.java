//package algorithms.leetcode.archive2022.archive11.lc1114;
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//class Solution1a {
//    //选出list1和list2头结点中值较小者，排除较小者后再继续进行merge操作，直到两个列表有一个为空
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null) {
//            return list2;
//        }else if (list2 == null) {
//            return list1;
//        } else if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        } else if (list1.val >= list2.val) {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//        return null;
//    }
//}