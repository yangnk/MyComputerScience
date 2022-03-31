package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-09 07:31
 **/
public class DFSTree {
    void dfs(DFSTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);

    }
}


class DFSTreeNode {
    int val;
    DFSTreeNode left;
    DFSTreeNode right;
    DFSTreeNode() {}
    DFSTreeNode(int val) { this.val = val; }
    DFSTreeNode(int val, DFSTreeNode left, DFSTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}