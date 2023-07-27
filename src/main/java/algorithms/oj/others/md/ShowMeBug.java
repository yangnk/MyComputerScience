package algorithms.oj.others.md;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShowMeBug {

    public static void main(String[] args) {
        ShowMeBug showMeBug = new ShowMeBug();
        Node node = new Node(1, null);
        int[] result = showMeBug.solution(node);
        System.out.println("result = " + result);

    }

    public static class Node {
        public int value;
        public Node[] childNodes;

        public Node(int value, Node[] childNodes) {
            this.value = value;
            this.childNodes = childNodes;
        }
    }

    public int[] solution(Node root) {
        // 在这⾥写代码
        if (root == null) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Node ptr = root;
        queue.offer(ptr);

        while (!queue.isEmpty()) {
            ptr = queue.poll();
            list.add(ptr.value);
            for (Node item : ptr.childNodes) {
                queue.offer(item);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
