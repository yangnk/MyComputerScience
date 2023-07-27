package dataStructureAndAlgorithms.leetcode.lc0516;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-16 22:21
 **/
//面试题 04.06. 后继者:https://leetcode.cn/problems/successor-lcci/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution1 {
    List<TreeNode> list = new ArrayList<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        inorder(root);
        int index = list.indexOf(p);
        if (index == -1 || index >= list.size() - 1) {
            return null;
        }
        return list.get(index + 1);
    }

    //递归中序遍历
    private void inorder(TreeNode root) {
        //退出条件
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}