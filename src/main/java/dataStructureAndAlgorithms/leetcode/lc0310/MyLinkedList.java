package dataStructureAndAlgorithms.leetcode.lc0310;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-10 23:31
 **/
class MyLinkedList {
    MyNode dummyHead;
    MyNode dummyTail;

    public MyLinkedList() {
        dummyHead = new MyNode();
        dummyTail = new MyNode();
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;
    }

    public int get(int index) {
        MyNode ptr = dummyHead;
        while (true) {
            if (ptr == null) {
                return -1;
            }

            if (index == 0) {
                return ptr.val;
            }
            index--;
            ptr = ptr.next;
        }

    }

    public void addAtHead(int val) {
        dummyHead.next = new MyNode(val, dummyHead.next, dummyHead);
    }

    public void addAtTail(int val) {
        dummyTail.pre = new MyNode(val, dummyTail, dummyTail.pre);
    }

    public void addAtIndex(int index, int val) {
        MyNode ptr = dummyHead;
        MyNode newNode = new MyNode(val, null, null);
        while (true) {
            if (index == 0) {
                newNode.pre = ptr;
                newNode.next = ptr.next;
                ptr.next = newNode.next;
                break;
            }
            index--;
            ptr = ptr.next;
        }
    }

    public void deleteAtIndex(int index) {
        MyNode ptr = dummyHead;
        while (true) {
            if (index == 0) {
                ptr.next = ptr.next.next;
                break;
            }
            index--;
            ptr = ptr.next;
        }

    }

    private class MyNode {
        int val;
        MyNode next;
        MyNode pre;

        public MyNode() {
            this.val = 0;
            this.next = null;
            this.pre = null;
        }

        public MyNode(int val, MyNode next, MyNode pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
