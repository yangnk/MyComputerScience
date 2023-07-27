package algorithms.leetcode.archive02.a0211.weekly;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        //包装成对象，塞到list中
        List<Creator> list = new ArrayList<>();
        for (int i = 0; i < creators.length; i++) {
            list.add(new Creator(creators[i], ids[i], views[i]));
        }

        //分组累加后根据views排序
        LinkedHashMap<String, Integer> map = list.stream()
                .collect(Collectors.groupingBy(Creator::getCreators, Collectors.summingInt(Creator::getViews)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));


        //找到views累加最大的creator
        Integer value = map.entrySet().iterator().next().getValue();
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                set.add(entry.getKey());
            } else {
                break;
            }
        }

        //根据views排序后求值
        Collections.sort(list, new Comparator<Creator>() {
            @Override
            public int compare(Creator o1, Creator o2) {
                return o2.getViews() - o1.views;
            }
        });

        List<List<String>> result = new ArrayList<>();
        for (Creator item : list) {
            if (set.contains(item.getCreators())) {
                List<String> itemList = new ArrayList<>();
                itemList.add(item.getCreators());
                itemList.add(item.getIds());
                result.add(itemList);
                set.remove(item.getCreators());
            }
        }
        return result;
    }
}

class Creator{
    String creators;
    String ids;
    int views;

    public Creator(String creators, String ids, int views) {
        this.creators = creators;
        this.ids = ids;
        this.views = views;
    }

    public String getCreators() {
        return creators;
    }

    public String getIds() {
        return ids;
    }

    public int getViews() {
        return views;
    }
}
