package algorithms.leetcode.archive2022.archive10.lc1020;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        //计算列表节点数-->节点数为奇数则false，偶数则计算中间节点位置-->快指针到中间位置，和满节点同步想去，能走完则为true
        int len = 0;
        ListNode ptr = head;
        while (ptr != null) {
            len++;
            ptr = ptr.next;
        }

        int mid;
        if (len == 1) {
            return true;
        } else if (len % 2 == 0) {
            mid = len / 2;
        } else {
            mid = len / 2 + 1;
        }

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < mid; i++) {
            fast = fast.next;
        }

        StringBuilder fastSb = new StringBuilder();
        StringBuilder slowSb = new StringBuilder();
        while (fast != null) {
            slowSb.append(slow.val);
            fastSb.append(fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        if (slowSb.reverse().toString().equals(fastSb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}