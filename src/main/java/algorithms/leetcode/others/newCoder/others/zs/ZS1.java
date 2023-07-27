package dataStructureAndAlgorithms.leetcode.newCoder.others.zs;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-16 22:57
 **/
public class ZS1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String input = in.nextLine();
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            char[] characters = input.toCharArray();

            for (int i = 0; i < characters.length; i++) {
                if (treeMap.get(characters[i]) == null) {
                    treeMap.put(characters[i], 1);
                    continue;
                }
                treeMap.put(characters[i], treeMap.get(characters[i]) + 1);
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry entry : treeMap.entrySet()) {
                stringBuffer.append(entry.getKey()).append(entry.getValue());
            }
            System.out.println(stringBuffer);
        }
    }

}
