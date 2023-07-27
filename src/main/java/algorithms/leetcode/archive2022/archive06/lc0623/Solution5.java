package algorithms.leetcode.archive2022.archive07.lc0723;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution5 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0;
        int len2 = 0;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        dummy1.next = pHead1;
        dummy2.next = pHead2;
        while (pHead1 != null) {
            len1++;
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            len2++;
            pHead2 = pHead2.next;
        }

        int dist = len1 - len2;
        pHead1 = dummy1.next;
        pHead2 = dummy2.next;
        if (dist > 0) {
            for (int i = 0; i < dist; i++) {
                pHead1 = pHead1.next;
            }
        } else if (dist < 0) {
            for (int i = 0; i < -dist; i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1 != null && pHead2 != null) {
            if (pHead1 == pHead2) {
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
}