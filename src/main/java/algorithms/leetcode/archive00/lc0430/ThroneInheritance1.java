package dataStructureAndAlgorithms.leetcode.lc0430;

import java.util.*;

class ThroneInheritance1 {
    Map<String, List<String>> map = new HashMap();
    Set<String> deathSet = new HashSet();
    String kingName;

    public ThroneInheritance1(String kingName) {
        this.kingName = kingName;
        map.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        map.get(parentName).add(childName);
        map.put(childName, new ArrayList<>());
    }

    public void death(String name) {
        deathSet.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> list = new ArrayList<>();
        preOrder(kingName, list);
        return list;
    }

    private void preOrder(String kingName, List<String> list) {
        if (kingName == null) {
            return;
        }
        if (!deathSet.contains(kingName)) {
            list.add(kingName);
        }
        for (String item : map.get(kingName)) {
            preOrder(item, list);
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */