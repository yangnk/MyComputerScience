package dataStructureAndAlgorithms.leetcode.others;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-10 00:04
 **/
public class Leetcode0210 {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<String> stack = new Stack<>();
        String[] str = s.replaceAll("\\s+", " ").trim().split("\\ ");
        for (String item : str) {
            stack.push(item);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        return new String(sb).trim();
    }
}
