package dataStructureAndAlgorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-30 23:27
 **/
//https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/solution/


//Definitionn for a binary tree node.
class TreeNod1230 {
    int val;
    TreeNod1230 left;
    TreeNod1230 right;
    TreeNod1230() {}
    TreeNod1230(int val) { this.val = val; }
    TreeNod1230(int val, TreeNod1230 left, TreeNod1230 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BD1230 {
    public List<List<Integer>> pathSum(TreeNod1230 root, int target) {
//        int leftSum = root.val - target;
//        if (getPathLen(root).contains(leftSum)) {
//
//        }
        List<Integer> pathLen = getPathLen(root);
        pathLen.contains(target);
        return null;

    }

    public List<Integer> getPathLen(TreeNod1230 root) {
        List<Integer> integerList = new ArrayList<>();
        if (root.left == null && root.right == null) {
            integerList.add(root.val);
            return integerList;
        }
        if (root.left != null) {
            for (Integer integer : getPathLen(root.left)) {
                integerList.add(root.val + integer);
            }
        }
        if (root.right != null) {
            for (Integer integer : getPathLen(root.right)) {
                integerList.add(root.val + integer);
            }
        }
        return integerList;
    }
}
