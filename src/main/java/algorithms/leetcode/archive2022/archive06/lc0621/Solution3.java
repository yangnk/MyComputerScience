package algorithms.leetcode.newCoder.nc0621;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution3 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
                cur.next = null;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
                cur.next = null;
            }

        }
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return dummy.next;
    }
}