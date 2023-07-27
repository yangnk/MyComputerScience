package algorithms.leetcode.archive2022.archive09.lc0908;


import java.util.Arrays;

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        TreeNode root = new TreeNode();
        recur(preorder, inorder, root);
        return root;
    }

    private void recur(int[] preorder, int[] inorder, TreeNode root) {
        if (preorder.length == 1) {
            return;
        }
        int divIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                divIndex = i;
                break;
            }
        }
        root.val = preorder[0];
        if (divIndex != 0) {
            TreeNode leftNode = new TreeNode(preorder[1]);
            root.left = leftNode;
            recur(Arrays.copyOfRange(preorder, 1, 1 + divIndex),
                    Arrays.copyOfRange(inorder, 0, divIndex), leftNode);
        }

        if (divIndex != preorder.length - 1) {
            TreeNode rightNode = new TreeNode(preorder[1 + divIndex]);
            root.right = rightNode;
            recur(Arrays.copyOfRange(preorder, 1 + divIndex, preorder.length),
                    Arrays.copyOfRange(inorder, 1 + divIndex, preorder.length), rightNode);
        }
    }
}