package dataStructureAndAlgorithms.newCoder.zs;

import java.util.Scanner;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-16 23:16
 **/
public class ZS2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String input = in.nextLine();
            StringBuffer charSb = new StringBuffer();
            StringBuffer signlSb = new StringBuffer();
            char[] chars = input.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    charSb.append(chars[i]);
                    continue;
                }
                signlSb.append(chars[i]);
            }
            System.out.println(signlSb.append(charSb));
        }
    }
}
