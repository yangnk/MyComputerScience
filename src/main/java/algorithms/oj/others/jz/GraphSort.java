package algorithms.oj.others.jz;

//1. 简单实现一个拓扑排序，解析任务执行的先后顺序。
//        如任务A依赖于任务B记成 A -> B
//        实现： A->C B->D C->E B->C D->E F->A F->B
//        最终算出执行顺序为 E C A D B F


//节点
class Node {
    public char label;
    public Node(char label) {
        this.label = label;
    }
}

public class GraphSort {
    //图的属性
    private Node nodeList[];
    private int adjMatrix[][];
    private int nodes;
    private char sortedArray[];

    public GraphSort(int size) {
        nodeList = new Node[size];
        adjMatrix = new int[size][size];
        nodes = 0;
        sortedArray = new char[size];
    }

    public void addNode(char label) {
        nodeList[nodes++] = new Node(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
    }

    //找到图中第一个没有后继节点的节点将其删除，同时邻接矩阵和节点列表调整，循环直到没有节点列表为空
    public void topo() {
        int origNodes = nodes;
        while (nodes > 0) {
            int currentNode = noSuccessors();
            if (currentNode == -1) {
                System.out.println("graph has cycles");
                return;
            }
            sortedArray[nodes - 1] = nodeList[currentNode].label;
            deleteNode(currentNode);
        }

        System.out.print("topo sorted order : ");
        for (int i = origNodes - 1; i >= 0; i--) {
            System.out.print(sortedArray[i]);
        }
        System.out.println();
    }

    private void moveRowUp(int row, int length) {
        for (int col = 0; col < length; col++) {
            adjMatrix[row][col] = adjMatrix[row + 1][col];
        }
    }

    private void moveColLeft(int col, int length) {
        for (int row = 0; row < length; row++) {
            adjMatrix[row][col] = adjMatrix[row][col + 1];
        }
    }

    public void deleteNode(int delNode) {
        if (delNode != (nodes - 1)) {
            for (int i = delNode; i < nodes - 1; i++) {
                nodeList[i] = nodeList[i + 1];
            }

            for (int row = delNode; row < nodes - 1; row++) {
                moveRowUp(row, nodes);
            }

            for (int col = delNode; col < nodes - 1; col++) {
                moveColLeft(col, nodes - 1);
            }
        }
        nodes--;
    }

    //判断图是否成环，所有节点都有后继节点即成环
    public int noSuccessors() {
        boolean isEdge;
        for (int row = 0; row < nodes; row++) {
            isEdge = false;
            for (int col = 0; col < nodes; col++) {
                if (adjMatrix[row][col] == 1) {
                    isEdge = true;
                    break;
                }
            }
            if (!isEdge)
                return row;
        }
        return -1;
    }

    public static void main(String[] args) {
        GraphSort graph = new GraphSort(6);
        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');
        graph.addNode('D');
        graph.addNode('E');
        graph.addNode('F');

        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.topo();
    }
}

