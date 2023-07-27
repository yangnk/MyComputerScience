package dataStructureAndAlgorithms.leetcode.lc0430;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-04-30 08:23
 **/
class ThroneInheritance {
    class Node {
        String name;
        List<Node> childrenList = new ArrayList<>();
        int isDeath = 0;

        public Node(String name) {
            this.name = name;
        }

        public Node(String name, String children) {
            this.name = name;
            childrenList.add(new Node(children));
        }
    }

    Node kingNode;

    public ThroneInheritance(String kingName) {
        this.kingNode = new Node(kingName);
    }

    public void birth(String parentName, String childName) {
        operateBirth(kingNode, parentName, childName);
    }

    //递归查询parentName节点，查到后在其childrenList新增子节点
    private void operateBirth(Node kingNode, String parentName, String childName) {
        if (kingNode == null) {
            return;
        }
        System.out.println(kingNode.name);
        System.out.println(parentName);
        if (kingNode.name == parentName) {
            kingNode.childrenList.add(new Node(childName));
            return;
        }
        for (Node child : kingNode.childrenList) {
            System.out.println(child);
            operateBirth(child, parentName, childName);
        }
    }

    public void death(String name) {
        operateDeath(kingNode, name);
    }

    //递归查询name节点，查到给其death标志位设置为1
    private void operateDeath(Node kingNode, String name) {
        if (kingNode == null) {
            return;
        }
        if (kingNode.name == name) {
            kingNode.isDeath = 1;
            return;
        }
        for (Node child : kingNode.childrenList) {
            operateDeath(child, name);
        }
    }

    public List<String> getInheritanceOrder() {
        List<String> resultList = new ArrayList<>();
        preInheritanceOrder(kingNode, resultList);
        return resultList;
    }

    //现序遍历kingNode，保存遍历结果到List
    private void preInheritanceOrder(Node kingNode, List<String> resultList) {
        if (kingNode == null) {
            return;
        }
        if (kingNode.isDeath != 1) {
            resultList.add(kingNode.name);
        }
        for (Node child : kingNode.childrenList) {
            preInheritanceOrder(child, resultList);
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