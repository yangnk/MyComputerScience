//package dataStructureAndAlgorithms.leetcode.lc0707;
//
//import java.util.*;
//import java.util.ArrayList;
//
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
//public class Solution {
//    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
//        if (pRoot == null) {
//            return new ArrayList<ArrayList<Integer>>();
//        } ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
//        Stack<TreeNode> stack = new Stack<>();
//
//        int level = 1;
//        deque.addLast(pRoot);
//        while (deque.size() != 0) {
//            ArrayList<Integer> list = new ArrayList<Integer>();
//            int size = deque.size();
//            if (level % 2 == 1) {
//                for (int i = 0; i < size; i++) {
//                    TreeNode node = deque.pollFirst();
//                    list.add(node.val);
//                    if (node.left != null) {
//                        deque.addLast(node.left);
//                    }
//                    if (node.right != null) {
//                        deque.addLast(node.right);
//                    }
//                }
//            } else {
//                stack.clear();
//                for (int i = 0; i < size; i++) {
//                    TreeNode node = deque.pollFirst();
//                    stack.push(node);
//                    if (node.left != null) {
//                        deque.addLast(node.left);
//                    }
//                    if (node.right != null) {
//                        deque.addLast(node.right);
//                    }
//                }
//                while (!stack.isEmpty()) {
//                    list.add(stack.pop().val);
//                }
//            }
//            level++;
//            result.add(list);
//        }
//        return result;
//    }
//}