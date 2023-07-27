package algorithms.leetcode.lc0624;


class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList(ListNode head1, ListNode head2) {

        ListNode reversedHead1 = reverseListNode(head1);
        ListNode reversedHead2 = reverseListNode(head2);
        ListNode dummyResult = new ListNode(0);
        ListNode curResult = dummyResult;
        int carry = 0;
        do {
            int value1 = (reversedHead1 == null ? 0 : reversedHead1.val);
            int value2 = (reversedHead2 == null ? 0 : reversedHead1.val);

            int value;
            if (carry == 1) {
                value = value1 + value2 + 1;
                carry = 0;
            } else {
                value = value1 + value2;
            }
            if (value >= 10) {
                value = value % 10;
                carry = 1;
            }
            ListNode newNode = new ListNode(value);
            curResult.next = newNode;
            curResult = curResult.next;

            reversedHead1 = reversedHead1.next;
            reversedHead2 = reversedHead2.next;
        } while (reversedHead1.next != null || reversedHead2.next != null);
        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            curResult.next = newNode;
        }
        return reverseListNode(dummyResult.next);
    }

    public ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre.next;
        int i = 0, j = 0, k = 0;
        while (cur.next != null) {
            System.out.printf("======j:%d\n", j++);
            ListNode curNext = cur.next;
            cur.next = curNext.next;
            curNext.next = pre.next;
            pre.next = curNext;
        }
        return pre.next;
    }
}
