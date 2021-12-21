package dataStructureAndAlgorithms.oj.hw;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-11 15:22
 **/
import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String intStr = in.nextLine();
            StringBuilder sb = new StringBuilder();
            String[] intArr = intStr.split(" ");
            TreeMap<Integer, String> intTreeMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int maxLen = String.valueOf(o1).length() > String.valueOf(o2).length() ?
                            String.valueOf(o2).length() : String.valueOf(o1).length();
                    for (int i = 0; i < maxLen; i++) {
                        if (Integer.parseInt(Character.toString(String.valueOf(o1).charAt(i))) > Integer.parseInt(Character.toString(String.valueOf(o2).charAt(i)))) {
                            return -1;
                        }else {
                            return 1;
                        }
                    }
                    return 0;
                }
            });

            for (int i = 0; i < intArr.length; i++) {
                intTreeMap.put(Integer.parseInt(intArr[i]), intArr[i]);
            }
            for (int i = 0; i < intArr.length; i++) {
                String value = intTreeMap.firstEntry().getValue();
                sb.append(value);
                intTreeMap.pollFirstEntry();
            }
            System.out.println(sb);
        }
    }
}