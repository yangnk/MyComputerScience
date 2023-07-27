package dataStructureAndAlgorithms.leetcode.lc0404a;


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

public class Solution {
    static TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

    public int[] findMode(TreeNode root) {
        getPreTravel(root);
        //根据value排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<Integer> result = new ArrayList<Integer>();
        int maxValue = list.get(0).getValue();
        for (Map.Entry item : list) {
            if ((int) item.getValue() == maxValue) {
                result.add((Integer) item.getKey());
            }
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }

    //先序遍历
    public void getPreTravel(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        if (treeMap.containsKey(treeNode.val)) {
            treeMap.put(treeNode.val, treeMap.get(treeNode.val));
        } else {
            treeMap.put(treeNode.val, 1);
        }

        getPreTravel(treeNode.left);
        getPreTravel(treeNode.right);
    }
}