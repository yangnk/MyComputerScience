package algorithms.leetcode.archive2022.archive11.lc1120;

import java.util.LinkedHashMap;

class LRUCache {
    int capacity;
    LinkedHashMap<Integer, Integer> lru;

    public LRUCache(int capacity) {
        lru = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (lru.containsKey(key)) {
            int value = lru.get(key);
            lru.remove(key);
            lru.put(key, value);
            return value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (lru.containsKey(key)) {
            lru.remove(key);
            lru.put(key, value);
        } else {
            if (lru.size() < capacity) {
                lru.put(key, value);
            } else {
                int lastKey = (Integer)lru.keySet().toArray()[lru.size() - 1];
                lru.remove(lastKey);
                lru.put(key, value);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
