package dataStructureAndAlgorithms.leetcode.lc0309;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode curr   = head;

        while (curr != null) {
            if (curr.val == val) {
                curr = curr.next;
                pre.next = curr;
            }else {
                pre = pre.next;
                curr = curr.next;
            }
        }
        return dummyHead.next;
    }
}
