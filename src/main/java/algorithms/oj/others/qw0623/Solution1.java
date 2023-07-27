package algorithms.oj.others.qw0623;

import java.util.*;

/**
 * @author yangningkai
 * @create 2022-06-23 19:14
 **/

public class Solution1 {
    public static void main(String[] args) {
        String[] words1 = {"y", "z", "xy"};
        System.out.println(transfer(words1));
        String[] words2 = {"ba", "ab", "cb"};
        System.out.println(transfer(words2));
    }

    public static String transfer(String[] words) {
        int len = words.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            String left = words[i];
            String right = words[i + 1];
            int index = 0;
            while (index < Math.min(left.length(), right.length())) {
                if (left.charAt(index) == right.charAt(index)) {
                    index++;
                    continue;
                }
                list.add(String.valueOf(left.charAt(index)) + String.valueOf(right.charAt(index)));
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            if (sb.equals("")) {
                sb.append(item);
                continue;
            }
            if (sb.indexOf(item.substring(0, 1)) < 0) {
                sb.insert(0, item);
                continue;
            }
            int index = sb.indexOf(item.substring(0, 1));
            sb.insert(index + 1, item.substring(1, 2));
        }
        return String.valueOf(sb);
    }
}
