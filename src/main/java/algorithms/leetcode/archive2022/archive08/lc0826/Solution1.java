package algorithms.leetcode.archive2022.archive08.lc0826;

import java.util.*;

public class Solution1 {

//    public static void main(String[] args) {
//        LUPrefix solution1 = new LUPrefix();
//        List<List<String>> lists = solution1.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat", "ac", "bd", "aac", "bbd", "aacc", "bbdd", "acc", "bdd"});
//        System.out.println(lists.toString());
//    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//        String[] newStrs = new String[strs.length];
//        List<List<String>> result = new ArrayList<>();
//        //新数组中已经将元素按照字符递增排序
//        for (int i = 0; i < strs.length; i++) {
//            List<Character> list = new ArrayList();
//            char[] chars = strs[i].toCharArray();
//            for (int j = 0; j < chars.length; j++) {
//                list.add(chars[j]);
//            }
//            //字符排序，若数组元素字符相同得到相同字符串
//            Collections.sort(list);
//            String sortedStr = "";
//            for (int j = 0; j < list.size(); j++) {
//                sortedStr += list.get(j);
//            }
//            newStrs[i] = sortedStr;
//        }
//        //对相同字符串进行分组
//        Map<String, String> map = new HashMap<>();
//        for (int i = 0; i < strs.length; i++) {
//            if (!map.containsKey(newStrs[i])) {
//                map.put(newStrs[i], String.valueOf(i));
//            } else {
//                map.put(newStrs[i], map.get(newStrs[i]) + "," + i);
//            }
//        }
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> next = iterator.next();
//            String value = next.getValue();
//            String[] split = value.split(",");
//            List<String> list = new ArrayList<>();
//            for (int i = 0; i < split.length; i++) {
//                list.add(strs[Integer.valueOf(split[i])]);
//            }
//            result.add(list);
//        }
//        return result;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> list = map.getOrDefault(s, new ArrayList<String>());
            list.add(strs[i]);
            map.put(s, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
