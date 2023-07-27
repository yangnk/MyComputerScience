package algorithms.leetcode.archive2022.archive08.lc0826;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution3 {
    //通过递归方式来比较左右子树是否成镜像，true：递归到叶子节点都为null；false：（1）左右子树val不相等；（2）左右子树一个存在一个不存在

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recur(root.left, root.right);


    }

    private boolean recur(TreeNode left, TreeNode right) {
        System.out.println("===");
        System.out.println("left.val = " + left.val == null ? "" : left.val);
        System.out.println("right.val = " + right.val == null ? "" : right.val);
        System.out.println("===");
        //终止条件
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        //递归逻辑
        return recur(left.left, right.right) && recur(left.right, right.left);
    }


//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return compareTree(root.left, root.right);
//    }
//
//    private boolean compareTree(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//        if (left == null || right == null || left.val != right.val) {
//            return false;
//        }
//        return compareTree(left.left, right.right) && compareTree(left.right, right.left);
//    }
}
