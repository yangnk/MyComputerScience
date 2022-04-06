package dataStructureAndAlgorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-04-04 00:10
 **/
public class lc0404 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));

    }

    public static String convert(String s, int numRows) {
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            stringBuilderList.add(new StringBuilder());
        }
        char[] chars = s.toCharArray();
        int flag = -1;
        int row = 0;
        for (char c : chars) {
            stringBuilderList.get(row).append(c);
            if (row == 0 || row == numRows - 1) {
                flag = -flag;
            }
            row += flag;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : stringBuilderList) {
            result.append(sb);
        }
        return new String(result);
    }

//    public static String convert(String s, int numRows) {
//        char[] chars = s.toCharArray();
//        char[][] chars1 = new char[numRows][1000];
//        int result;
//        int remainder;
//        for (int i = 0; i < chars.length; i++) {
//            result = i / 2 * (numRows - 1);
//            remainder = i % 2 * (numRows - 1);
//            if (remainder >= 0 && remainder <= numRows) {
//                chars1[remainder][result * (numRows - 1) * 2] = new Character(chars[i]);
//            }
//            if (remainder >numRows) {
//                chars1[numRows - 1 - (remainder - numRows)][remainder * (numRows - 1) * 2 + (remainder - numRows)] = chars[i];
//            }
//
//        }
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int j = 0; j < numRows; j++) {
//            for (int k = 0; k < chars1[j].length; k++) {
//                if ((chars1[j][k] >= 'A' && chars1[j][k] >= 'z') || chars1[j][k] == ',' || chars1[j][k] == '.') {
//                    stringBuffer.append(chars1[j][k]);
//                }
//            }
//        }
//        return new String(stringBuffer);
//    }
}
