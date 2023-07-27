package algorithms.leetcode.archive2022.archive07.lc0727;

//输入：s = "{a,b}c{d,e}f"
//        输出：["acdf","acef","bcdf","bcef"]

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.expand("{a,b}c{d,e}f");
        System.out.println();

    }

    List<String> list = new ArrayList<>();
    public String[] expand(String s) {
        String replaceStr = s.replace(",", "")
                .replace("{", "|")
                .replace("}", "|");
        int start = replaceStr.indexOf("|") == 0 ? 0 : -1;
        int end = 0;
        while (end != -1) {
            end = replaceStr.indexOf("|", start + 1);
            if (end == -1 && start != s.length() - 1) {
                list.add(replaceStr.substring(start + 1, replaceStr.length()));
                break;
            }
            list.add(replaceStr.substring(start + 1, end));
            start = end;
        }
        return null;

    }
}
