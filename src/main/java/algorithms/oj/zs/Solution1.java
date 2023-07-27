package algorithms.oj.zs;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("-?\\d+");
//        Matcher m = p.matcher("c12m23b3n4t56");
//        while (m.find()) {
//            System.out.println(m.group());
//        }

        ArrayList<Integer> list = extraNum("c12m23b3n4t56");
        System.out.println("list = " + list);

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return int整型ArrayList
     */
    public static ArrayList<Integer> extraNum (String s) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            result.add(Integer.valueOf(m.group()));
        }
        return result;
    }
}
