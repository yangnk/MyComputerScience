package dataStructureAndAlgorithms.leetcode.lc0417;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        //快指针fast向前走n+1步
        while (n >= 0) {
            fast = fast.next;
            n--;

        }
        //快慢指针同时向前，等快指针到null，慢指针到倒数第n+1个位置
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //跳过倒数第n个位置
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}