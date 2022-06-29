package dataStructureAndAlgorithms.leetcode.lc0309;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-09 21:10
 **/
class TimeMap {
    HashMap<String, SubTreeMap> hashMap;

    public TimeMap() {
        hashMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!hashMap.containsKey(key)) {
            new SubTreeMap((TreeMap<Integer, String>) new TreeMap<>().put(timestamp, value));
        }else {
            hashMap.get(key).treeMap.put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        if (!hashMap.containsKey(key)) {
            return null;
        } else if (hashMap.get(key).treeMap.lastKey() > timestamp) {
            return null;
        } else {
            TreeMap<Integer, String> treeMap = hashMap.get(key).treeMap;
            while (true) {
                Map.Entry<Integer, String> integerStringEntry = treeMap.pollFirstEntry();
                if (integerStringEntry.getKey() >= timestamp) {
                    return integerStringEntry.getValue();
                }
            }
        }
    }

    private class SubTreeMap {
        TreeMap<Integer, String> treeMap;

        public SubTreeMap(TreeMap<Integer, String> treeMap) {
            this.treeMap = treeMap;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */