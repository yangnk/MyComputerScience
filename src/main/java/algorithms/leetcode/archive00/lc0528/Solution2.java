package dataStructureAndAlgorithms.leetcode.lc0528;

//
//给定单个链表的头 head ，使用 插入排序 对链表进行排序，并返回 排序后链表的头 。
//
//        插入排序 算法的步骤:
//
//        插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
//        每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
//        重复直到所有输入数据插入完为止。
//        下面是插入排序算法的一个图形示例。部分排序的列表(黑色)最初只包含列表中的第一个元素。每次迭代时，从输入数据中删除一个元素(红色)，并就地插入已排序的列表中。
//
//        对链表进行插入排序。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode.cn/problems/insertion-sort-list
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution2 {
    public ListNode insertionSortList1(ListNode head) {
        //初始化dummyNewHead第一个节点
        ListNode dummyNewHead = new ListNode();
        dummyNewHead.next = head;
        head = head.next;

        //循环对head节点进行插入排序
        while (head != null) {
            System.out.printf("head.val:%d\n", head.val);
            ListNode selectedHead = head;
            head = head.next;
            selectedHead.next = null;
            ListNode ptrNewHead = dummyNewHead.next;//指向newHead第一个节点
            int i = 0;
            while (true) {
                System.out.println(i++);
                //ptrNewHead下一个节点比selectedHead大，进行插入
                if (ptrNewHead.next.val >= selectedHead.val) {
                    System.out.printf("111\n");
                    selectedHead.next = ptrNewHead.next;
                    ptrNewHead.next = selectedHead;
                    break;
                }
                ptrNewHead = ptrNewHead.next;
                //没有找到，放到newHead最后一个节点
                if (ptrNewHead == null) {
                    System.out.printf("222\n");
                    ptrNewHead.next = selectedHead;
                    break;
                }
                System.out.printf("ptrNewHead.val:%d\n", ptrNewHead.val);
            }
        }
        return dummyNewHead.next;
    }


//    public ListNode insertionSortList(ListNode head) {
//        ListNode dummyNewHead = new ListNode();
//        dummyNewHead.next = head;
//        head = head.next;
//        dummyNewHead.next.next = null;
//
//        while (head != null) {
//            ListNode selectedHead = head;
//            selectedHead.next = null;
//            head = head.next;
//            ListNode newHeadPtr = dummyNewHead.next;
//
//            while (true) {
//                //如果是最大值，插入顺序序列最后
//                if (newHeadPtr.next == null) {
//                    newHeadPtr.next = selectedHead;
//                    break;
//                }
//                //顺序数列中找空插入
//                System.out.printf("selectedHead.val:%d", selectedHead.val);
//                System.out.printf("newHeadPtr.next.val:%d", newHeadPtr.next.val);
//                if (selectedHead.val >= newHeadPtr.next.val) {
//                    selectedHead.next = newHeadPtr.next;
//                    newHeadPtr.next = selectedHead;
//                    break;
//                }
//                newHeadPtr = newHeadPtr.next;
//            }
//        }
//        return dummyNewHead.next;
//    }
}