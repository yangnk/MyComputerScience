package dataStructureAndAlgorithms.leetcode.others;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-15 14:46
 **/
//https://leetcode-cn.com/problems/majority-element/

public class Leecode0115 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (Integer i : nums) {
            if (!integerIntegerMap.containsKey(i)) {
                integerIntegerMap.put(i, 1);
            } else {
                integerIntegerMap.put(i, integerIntegerMap.get(i) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(integerIntegerMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        return list.get(0).getKey();
    }
}


//    //塞值
//    Map<Integer, Integer> integerIntegerMap = new HashMap<>();
//        for (Integer i : nums) {
//                if (!integerIntegerMap.containsKey(i)) {
//                integerIntegerMap.put(i, 1);
//                }else {
//                integerIntegerMap.put(i, integerIntegerMap.get(i) + 1);
//                }
//                }
//                //排序
//                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(integerIntegerMap.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//@Override
//public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//        return o2.getValue() - o1.getValue();
//        }
//        });
//        return list.get(0).getKey();
//        }