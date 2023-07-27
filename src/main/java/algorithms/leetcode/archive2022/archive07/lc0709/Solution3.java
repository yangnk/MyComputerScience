package algorithms.leetcode.archive2022.archive07.lc0709;

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
    public boolean evaluateTree(TreeNode root) {
        dfs(root);
        return root.val == 1 ? true : false;
    }

    private int dfs(TreeNode root) {
        if (root == null || root.val == 0 || root.val == 1) {
            return -1;
        }
        dfs(root.left);
        dfs(root.right);

        int leftVal = root.left.val;
        int rightVal = root.right.val;
        if (root.val == 3) {
            Boolean a = (leftVal == 1 ? true : false);
            Boolean b = (rightVal == 1 ? true : false);
            boolean result = a && b;
            Integer value = result ? 1 : 0;
            root.val = value;
            root.left = null;
            root.right = null;
        } else if (root.val == 2) {
            Boolean a = (leftVal == 1 ? true : false);
            Boolean b = (rightVal == 1 ? true : false);
            boolean result = a || b;
            Integer value = result ? 1 : 0;
            root.val = value;
            root.left = null;
            root.right = null;
        }
        return -1;
    }
}