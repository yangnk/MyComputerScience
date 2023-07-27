package algorithms.leetcode.archive04.a0425;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution1 {
    public TreeNode sortedListToBST(ListNode head) {

        ListNode start = head;
        ListNode end = null;

        TreeNode res = new TreeNode();
        ListNode mid = getMidNode(start, end);

        while (start != mid && end != mid) {
            TreeNode node = new TreeNode(mid.val);
            if (mid != start) {
                end = mid;
                ListNode left = getMidNode(start, end);
                TreeNode leftNode = new TreeNode(left.val);
                node.left = leftNode;
//                node = leftNode;
            }
            if (mid != end) {
                start = mid.next;
                ListNode right = getMidNode(start, end);
                TreeNode rightNode = new TreeNode(right.val);
                node.right = rightNode;
            }
        }
        return res;
    }

    private ListNode getMidNode(ListNode start, ListNode end) {
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        fast.next = start;
        slow.next = start;
        while (fast != end || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
