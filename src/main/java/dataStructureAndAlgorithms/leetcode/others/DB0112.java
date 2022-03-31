//package dataStructureAndAlgorithms.leetcode;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2022-01-12 23:48
// **/
//
////输入：lists = [[1,4,5],[1,3,4],[2,6]]
////        输出：[1,1,2,3,4,4,5,6]
////        解释：链表数组如下：
////        [
////        1->4->5,
////        1->3->4,
////        2->6
////        ]
////        将它们合并到一个有序链表中得到。
////        1->1->2->3->4->4->5->6
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
//public class DB0112 {
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode result1 = new ListNode();
//        for (int i = 0; i < lists.length; i++) {
//            result1= mergeTwoLists(result1, lists[0]);
//        }
//        return result1;
//    }
//
//    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
//        if (a == null) {
//            //返回后继节点
//            return b;
//        }else if (b == null) {
//            return a;
//        } else if (a.val < b.val) {
//            a.next = mergeTwoLists(a.next, b);
//            return a;
//        }else {
//            b.next = mergeTwoLists(a, b.next);
//            return b;
//        }
//    }
//}
