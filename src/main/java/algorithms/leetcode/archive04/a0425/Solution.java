package algorithms.leetcode.archive04.a0425;


//复数 可以用字符串表示，遵循 "实部+虚部i" 的形式，并满足下述条件：
//
//        实部 是一个整数，取值范围是 [-100, 100]
//        虚部 也是一个整数，取值范围是 [-100, 100]
//        i2 == -1
//        给你两个字符串表示的复数 num1 和 num2 ，请你遵循复数表示形式，返回表示它们乘积的字符串。
//
//输入：num1 = "1+1i", num2 = "1+1i"
//        输出："0+2i"
//        解释：(1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。

public class Solution {

    public static String complexNumberMultiply(String num1, String num2) {

        //a为实部，b为虚部
        String[] split1 = num1.split("\\+");
        String a1 = split1[0];
        int len1 = split1[1].length();
        String b1 = split1[1].substring(0, len1 - 1);

        String[] split2 = num2.split("\\+");
        String a2 = split2[0];
        int len2 = split2[1].length();
        String b2 = split2[1].substring(0, len2 - 1);

        int aa = Integer.valueOf(a1) * Integer.valueOf(a2) - Integer.valueOf(b1) * Integer.valueOf(b2);
        int bb = Integer.valueOf(a1) * Integer.valueOf(b2) + Integer.valueOf(a2) * Integer.valueOf(b1);

        StringBuilder res = new StringBuilder();
        res.append(aa);
        res.append("+");
        res.append(bb);
        res.append("i");

        return res.toString();
    }

    public static void main(String[] args) {

        String str1 = "1+-1i";
        String str2 = "1+-1i";
        String s = complexNumberMultiply(str1, str2);
        System.out.println("s = " + s);

    }
}
