package dataStructureAndAlgorithms.oj.others.hw;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-11 14:30
 **/
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            String preValue = "1";
            for (int i = 0; i < a; i++) {
                String nextValue = getNextValue(preValue);
                preValue = nextValue;
            }
            System.out.println(preValue);
        }
    }

    private static String getNextValue(String preValue) {
        StringBuilder preValueStr = new StringBuilder(String.valueOf(preValue));
        preValueStr.append(0);
        StringBuilder sb = new StringBuilder();
        Character flag = preValueStr.charAt(0);
        int count = 0;
        for (int i = 0; i < preValueStr.length(); i++) {
            if (flag == preValueStr.charAt(i)) {
                count++;
                continue;
            }
            sb.append(count).append(preValueStr.charAt(i - 1));
            flag = preValueStr.charAt(i);
            count = 1;
        }
        return new String(sb);
    }
}
