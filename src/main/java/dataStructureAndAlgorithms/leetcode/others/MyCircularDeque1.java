//package dataStructureAndAlgorithms.leetcode;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2022-01-30 09:50
// **/
//class MyCircularDeque {
//    ArrayList deque;
//    int len;
//    int front;
//    int last;
//    int flag;
//
//    public MyCircularDeque(int k) {
//        deque = new ArrayList(k);
//        int len = k;
//        front = 0;
//        last = 0;
//        flag = 0;
//    }
//
//    public boolean insertFront(int value) {
//        if (flag == 1) {
//            return false;
//        }
//        if (front == 0) {
//            front = len - 1;
//            deque.add(front, value);
//        }else {
//            front--;
//            deque.add(front, value);
//        }
//        if (front == last) {
//            flag = 1;
//        }
//        return true;
//    }
//
//    public boolean insertLast(int value) {
//        if (flag == 1) {
//            return false;
//        }
//        deque.add(last, value);
//        if (last == len - 1) {
//            last = 0;
//        }else {
//            last++;
//        }
//        if (front == last) {
//            flag = 1;
//        }
//        return true;
//    }
//
//    public boolean deleteFront() {
//        if (flag == 0) {
//            return false;
//        }
//        if (front == len - 1) {
//            front = 0;
//        }else {
//            front++;
//        }
//        if (front == last) {
//            flag = 0;
//        }
//        return true;
//    }
//
//    public boolean deleteLast() {
//        if (flag == 0) {
//            return false;
//        }
//        if (last == 0) {
//            last = len - 1;
//        }else {
//            last--;
//        }
//        if (front == last) {
//            flag = 0;
//        }
//        return true;
//    }
//
//    public int getFront() {
//        return (int)deque.get(front);
//    }
//
//    public int getRear() {
//        if (last != 0) {
//            return (int) deque.get(last - 1);
//        }else {
//            return (int) deque.get(len - 1);
//        }
//
//    }
//
//    public boolean isEmpty() {
//        if (flag == 0) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    public boolean isFull() {
//        if (flag == 1) {
//            return true;
//        }else {
//            return false;
//        }
//
//    }
//}
