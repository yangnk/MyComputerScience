package algorithms.leetcode.archive2022.archive09.lc0905;


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
    public boolean isValidBST(TreeNode root) {
        return postTravel(root);
    }

    private boolean postTravel(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val <= getVal(root.left, new int[]{root.left.val, root.left.val})[1]) {
            return false;
        }
        if (root.right != null && root.val >= getVal(root.right, new int[]{root.right.val, root.right.val})[0]) {
            return false;
        }
        return postTravel(root.left) && postTravel(root.right);
    }

    //min:int[0],max:int[1]
    private int[] getVal(TreeNode root, int[] valArr) {
        if (root.left != null) {
            getVal(root.left, valArr);
        }
        if (root.right != null) {
            getVal(root.right, valArr);
        }
        if (valArr[0] > root.val) {
            valArr[0] = root.val;
        }
        if (valArr[1] < root.val) {
            valArr[1] = root.val;
        }
        return valArr;
    }
}