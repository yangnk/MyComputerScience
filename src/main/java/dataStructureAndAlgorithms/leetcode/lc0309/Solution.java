//package dataStructureAndAlgorithms.leetcode.lc0309;
//
//
//import java.util.Stack;
//
//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//
//public class Solution {
//    public ListNode reverseList(ListNode head) {
//        //head为null
//        if (head == null) {
//            return null;
//        }
//        //listNode加入到stack
//        Stack<ListNode> stack = new Stack<>();
//        ListNode tmpNode = new ListNode();
//        while (head != null) {
//            tmpNode = head;
//            head = head.next;
//            tmpNode.next = null;
//            stack.push(tmpNode);
//        }
//        //先进后出弹出节点
//        ListNode reverseHead = new ListNode();
//        ListNode index = new ListNode();
//        reverseHead = stack.pop();
//        index = reverseHead;
//        while (!stack.isEmpty()) {
//            index.next = stack.pop();
//            index = index.next;
//        }
//        return reverseHead;
//    }
//}