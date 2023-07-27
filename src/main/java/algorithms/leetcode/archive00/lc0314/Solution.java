package dataStructureAndAlgorithms.leetcode.lc0314;

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

class Solution {
    public ListNode swapPairs(ListNode head) {
        //使用虚拟节点dummyHead
        ListNode dummyHead = new ListNode();
        ListNode newHead = new ListNode();
        dummyHead.next = head;
        //null或者一个节点
        if (dummyHead.next == null || dummyHead.next.next == null) {
            return dummyHead.next;
        }
        //第二个节点为新的头结点
        newHead = dummyHead.next.next;
        while (dummyHead.next != null) {
            if (dummyHead.next.next == null) {
                break;
            }
            //定义left和right节点
            ListNode left = dummyHead.next;
            ListNode right = dummyHead.next.next;
            //进行交换
            left.next = right.next;
            right.next = left;
            dummyHead.next = right;
            dummyHead = left;
        }
        return newHead;
    }
}