package dataStructureAndAlgorithms.leetcode.lc0317;

import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public TreeNode invertTree(TreeNode root) {
        //空值判断
        if (root == null) {
            return root;
        }
        //队列进行层次遍历
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        //队列非空一直循环
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len-- > 0) {
                TreeNode tmp = queue.poll();
                swap(tmp);
                if (tmp.left != null) {
                    queue.offer(tmp.left);
                }
                if (tmp.right != null) {
                    queue.offer(tmp.right);
                }
            }
        }
        return root;
    }

    //交换左右子节点的位置
    private void swap(TreeNode tmp) {
        TreeNode swapTmp = tmp.left;
        tmp.left = tmp.right;
        tmp.right = swapTmp;
    }
}


////先序遍历
//class Solution {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        if (!stack.isEmpty()) {
//            TreeNode tmp = stack.pop();
//            list.add(tmp.val);
//            if (tmp.right != null) {
//                stack.push(tmp.right);
//            }
//            if (tmp.left != null) {
//                stack.push(tmp.left);
//            }
//        }
//        return list;
//    }
//}


////145. 二叉树的后序遍历
//class Solution {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        postOrder(root, list);
//        return list;
//    }
//    //递归函数
//    public void postOrder(TreeNode root, List list) {
//        if (root == null) {
//            return;
//        }
//        postOrder(root.left, list);
//        postOrder(root.right, list);
//        list.add(root.val);
//    }
//}


////144. 二叉树的前序遍历
//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        preOrder(root, list);
//        return list;
//    }
//
//    public static void preOrder(TreeNode root, List list) {
//        if (root == null) {
//            return;
//        }
//
//        list.add(root.val);
//        preOrder(root.left,list);
//        preOrder(root.right,list);
//    }
//}
