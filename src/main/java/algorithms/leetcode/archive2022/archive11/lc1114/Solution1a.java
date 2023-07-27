package algorithms.leetcode.archive2022.archive11.lc1114;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution1a {

    //申明一个虚拟头结点和pre指针，每次比较两个链表的头结点大小来决定pre.next指针的指向
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode pre = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }

        pre.next = (list1 == null ? list2 : list1);
        return dummyNode.next;
    }
}