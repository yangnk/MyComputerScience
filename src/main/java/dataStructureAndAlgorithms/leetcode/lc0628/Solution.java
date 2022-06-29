package dataStructureAndAlgorithms.leetcode.lc0628;

/**
 * @author yangningkai
 * @create 2022-06-29 00:04
 **/

import java.util.*;


class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
  public TreeNode(int val) {
    this.val = val;
  }
}


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    List<Integer> list = new ArrayList<>();
    public int[] preorderTraversal (TreeNode root) {
        preOrder(root);
        int[] ints = list.stream().mapToInt(i -> i).toArray();
        return ints;
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}