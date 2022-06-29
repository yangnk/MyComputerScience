package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-21 23:13
 **/
public class BD0221 {
    public static void main(String[] args) {
        System.out.println(addStr("123456","789"));
    }
    public String multiply(String num1, String num2) {
        return null;
    }

    public static String addStr(String num1, String num2) {
        StringBuffer addResultSb = new StringBuffer();
        String reserveNum1 = new StringBuffer(num1).reverse().toString();
        String reserveNum2 = new StringBuffer(num2).reverse().toString();
        int minMax = num1.length() < num2.length() ? num1.length() : num2.length();
        int carry = 0;
        for (int i = 0; i < minMax; i++) {
            int reserveNum1Int = reserveNum1.charAt(i) - '0';
            int reserveNum2Int = reserveNum2.charAt(i) - '0';
            int result = reserveNum1Int + reserveNum2Int + carry;
            carry = result / 10;
            addResultSb.append(String.valueOf(result));
        }
        String leftStr = num1.length() < num2.length() ? num2.substring(num1.length()) : num1.substring(num2.length());
        addResultSb.append(leftStr);
        return new StringBuffer(addResultSb).reverse().toString();
    }
}
