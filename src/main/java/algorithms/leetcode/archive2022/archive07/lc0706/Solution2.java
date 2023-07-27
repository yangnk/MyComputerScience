//package dataStructureAndAlgorithms.leetcode.lc0706;
//
//import java.util.*;
//
//
//class TreeNode {
//  int val = 0;
//  TreeNode left = null;
//  TreeNode right = null;
//  public TreeNode(int val) {
//    this.val = val;
//  }
//}
//
//
//public class Solution2 {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param root TreeNode类
//     * @return int整型一维数组
//     */
//    List<Integer> list = new ArrayList<>();
//    public int[] inorderTraversal (TreeNode root) {
//        if (root == null) {
//            return new int[0];
//        }
//        trave(root);
//        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
//        return array;
//    }
//
//    private void trave(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        trave(root.left);
//        list.add(root.val);
//        trave(root.right);
//    }
//}