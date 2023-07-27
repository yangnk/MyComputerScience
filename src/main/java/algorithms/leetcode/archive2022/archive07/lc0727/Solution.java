package algorithms.leetcode.archive2022.archive07.lc0727;

import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.decodeString("100[leetcode]");
        System.out.println("s = " + s);
    }

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            String tmp = "";
            if (substring.equals("]")) {
                while (!stack.peek().equals("[")) {
                    tmp += stack.pop();
                }
                stack.pop();//丢掉“(”
                int num = Integer.parseInt(stack.pop());//获取重复次数
                int exp = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    int newNum = Integer.parseInt(stack.pop());
                    num = num + newNum * (int)Math.pow(10, exp);
                    exp++;
                }
                String tmp1 = "";
                for (int j = 0; j < num; j++) {
                    tmp1 += new String(tmp);
                }
                for (int j = tmp1.length() - 1; j >= 0; j--) {
                    stack.push(tmp1.substring(j, j + 1));
                }
            } else {
                stack.push(substring);
            }
        }
        //将stack中单字母字符串拼接
        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }
        return result;
    }
}