package dataStructureAndAlgorithms.leetcode.others;

import java.util.Stack;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-21 21:37
 **/
public class EvaluateReversePolishNotation0121 {
    public static void main(String[] args) {
        String[] token = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(token));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String item : tokens) {
            if (!isSymbol(item)) {
                stack.push(Integer.parseInt(item));
            } else {
                int num1, num2;
                switch (item) {
                    case "+":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private static boolean isSymbol(String item) {
        return (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/"));
    }
}
