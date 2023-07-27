package algorithms.leetcode.archive2022.archive09.lc0907;


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

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        TreeNode root = new TreeNode();
        recur(nums, start, end, root);
        return root;
    }

    private void recur(int[] nums, int start, int end, TreeNode node) {
        if (start == end) {
            node.val = nums[start];
            return;
        }
        int mid = (start + end) / 2;
        node.val = nums[mid];
        if (mid != start) {
            TreeNode left = new TreeNode();
            node.left = left;
            recur(nums, start, mid - 1, left);
        }
        if (mid != end) {
            TreeNode right = new TreeNode();
            node.right = right;
            recur(nums, mid + 1, end, right);
        }
        return;
    }
}