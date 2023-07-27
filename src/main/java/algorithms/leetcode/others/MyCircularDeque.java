package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-02 21:08
 **/
class MyCircularDeque {
    int[] circularDeque;
    int front;
    int rear;
    int capacity;

    public MyCircularDeque(int k) {
        capacity = k + 1;
        circularDeque = new int[capacity];
        front = 0;
        rear = 0;

    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front + capacity - 1) % capacity;
        circularDeque[front] = value;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        circularDeque[rear] = value;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear + capacity - 1) % capacity;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return circularDeque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return circularDeque[(rear + capacity - 1) % capacity];

    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */