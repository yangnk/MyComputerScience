package algorithms.oj.zs;

public class Solution {

    public static void main(String[] args) {
//        String s = "ccmm";
//        String s1 = "cm";
//        System.out.println("s = " + s);
//        String s2 = s.replaceAll(s1, "");
////        s = s2;
//
//        System.out.println("s2 = " + s2);
////        System.out.println("s2 = " + s2);

        boolean b = magicString("ccm");
        System.out.println("b = " + b);

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public static boolean magicString (String s) {
        // write code here
        while (true) {
            int sLen = s.length();
            String s1 = s.replaceAll("cm", "");
            s = s1;
            if (sLen == s1.length()) {
                break;
            }
        }
        return "".equals(s);
    }
}
