//package algorithms.oj.others.jz;
//
//import java.util.ArrayList;
//import java.util.List;
//
////1. 简单实现一个拓扑排序，解析任务执行的先后顺序。
////        如任务A依赖于任务B记成 A -> B
////        实现： A->C B->D C->E B->C D->E F->A F->B
////        最终算出执行顺序为 E C A D B F
//
//class Graph1 {
//    int nodeNums;
//    List<String> nodeList ;
//    int[][] adjMatrix;
//
//    public Graph1(int nodeNums) {
//        this.nodeNums = nodeNums;
//        this.nodeList = new ArrayList<>();
//        adjMatrix = new int[nodeNums][nodeNums];
//    }
//
//    public void addNode(String node){
//        nodeList.add(node);
//    }
//
//    public void addEdge(int start,int end){
//        adjMatrix[start][end] = 1;
//    }
//}
//
//public class TopoSort {
//    Graph1 graph1;
//    int size;
//    String[] sortedArray;
//
//    public TopoSort(Graph1 graph) {
//        this.graph1 = graph;
//        this.size = graph.nodeNums;
//        this.sortedArray = new String[size];
//    }
//
//    private void sort(Graph1 graph) {
//        int orig_nVerts = size;
//        while(size>0){
//            int currentVertex = noSuccessors();
//            if(currentVertex==-1){
//                System.out.println("graph has cycles");
//                return;
//            }
//            sortedArray[size - 1] = graph1.nodeList.get(size - 1);
//            deleteVertex(currentVertex);
//        }
//
//        System.out.print("graph topo sorted order: ");
//        for(int i=0;i<orig_nVerts;i++){
//            System.out.print(sortedArray[i]);
//        }
//        System.out.println();
//
//    }
//
//    public int noSuccessors(){
//        boolean isEdge;
//        for(int row=0;row<size;row++){
//            isEdge = false;
//            for(int col=0;col<size;col++){
//                if (graph1.adjMatrix[row][col] == 1) {
//                    isEdge = true;
//                    break;
//                }
//            }
//            if(!isEdge){
//                return row;
//            }
//        }
//        return -1;
//    }
//    public void deleteVertex(int delVert){
//        if(delVert != (size-1)){
//            graph1.nodeList.remove(delVert);
//            for(int row=delVert;row<size-1;row++){
//                moveRowUp(row, size);
//            }
//
//            for(int col=delVert;col<size-1;col++){
//                moveColLeft(col, size-1);
//            }
//        }
//        size--;
//    }
//
//    private void moveRowUp(int row,int length){
//        for(int col=0;col<length;col++){
//            graph1.adjMatrix[row][col] = graph1.adjMatrix[row+1][col];
//        }
//    }
//
//    private void moveColLeft(int col,int length){
//        for(int row=0;row<length;row++){
//            graph1.adjMatrix[row][col] = graph1.adjMatrix[row][col+1];
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Graph1 graph = new Graph1(6);
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addNode("E");
//        graph.addNode("F");
//
//        graph.addEdge(0,2);
//        graph.addEdge(1,2);
//        graph.addEdge(1,3);
//        graph.addEdge(2,4);
//        graph.addEdge(3,4);
//
//        TopoSort topoSort = new TopoSort(graph);
//        topoSort.sort(graph);
//
//    }
//
//
//}
