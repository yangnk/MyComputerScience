package algorithms.oj.others.md0727;

//// 题目
///**
//
// 已知有一个字符串编码规则为: n(str)，表示括号内部的str重复n次。注意n大于0且小于10，str会存在嵌套也就是说str还可能嵌套n(str)。
// 例如：
// 输入：s = "3(a2(c))3(a)2(bc)"
// 输出："accaccaccaaabcbc"
// 要求：请用两种方式（递归和非递归）实现该算法。
// /
// public String decodeString(String s) {
// return null;
// }


import java.util.Stack;

// 可以引⼊的库和版本相关请参考 “环境说明”
public class ShowMeBug {
    public static String decodeStringByStack(String s) {
        Stack<String> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            String tmp = "";
            if (substring.equals(")")) {
                while (!stack.peek().equals("(")) {
                    tmp += stack.pop();
                }
                stack.pop();//丢掉“(”
                int num = Integer.parseInt(stack.pop());//获取重复次数
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    int newNum = Integer.parseInt(stack.pop());
                    num = num * 10 + newNum;
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

    static String src = "";
    static int ptr = 0;

    public static String decodeStringByRecursion(String s) {
        src = s;
        ptr = 0;
        return recuision();
    }

    public static String recuision() {
        if (ptr == src.length() || src.charAt(ptr) == ')') {
            return "";
        }
        char curr = src.charAt(ptr);
        int times = 1;
        String result = "";
        if (Character.isDigit(curr)) {
            times = getDigits();
            ptr++;
            String str = recuision();
            ptr++;
            while (times-- > 0) {
                result += str;
            }
        } else if (Character.isLetter(curr)) {
            result = String.valueOf(src.charAt(ptr++));
        }
        return result + recuision();
    }

    public static int getDigits() {
        int ret = 0;
        while (ptr < src.length() && Character.isDigit(src.charAt(ptr))) {
            ret = ret * 10 + src.charAt(ptr++) - '0';
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = decodeStringByStack("3(a2(c))3(a)2(bc)");
        System.out.println("s = " + s);
        String s1 = decodeStringByRecursion("3(a2(c))3(a)2(bc)");
        System.out.println("s1 = " + s1);
    }
}
