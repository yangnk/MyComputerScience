package dataStructureAndAlgorithms.newCoder.nc0618;

//描述
//        将一个节点数为 size 链表 m 位置到 n 位置之间的区间反转，要求时间复杂度 O(n)O(n)，空间复杂度 O(1)O(1)。
//        例如：
//        给出的链表为 1\to 2 \to 3 \to 4 \to 5 \to NULL1→2→3→4→5→NULL, m=2,n=4m=2,n=4,
//        返回 1\to 4\to 3\to 2\to 5\to NULL1→4→3→2→5→NULL.
//
//        数据范围： 链表长度 0 < size \le 10000<size≤1000，0 < m \le n \le size0<m≤n≤size，链表中每个节点的值满足 |val| \le 1000∣val∣≤1000
//        要求：时间复杂度 O(n)O(n) ，空间复杂度 O(n)O(n)
//        进阶：时间复杂度 O(n)O(n)，空间复杂度 O(1)O(1)

import java.util.*;

class ListNode {
  int val;
  ListNode next = null;
}

public class Solution1 {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        int count = 1;
        ListNode reverseHead = head;
        while (count < m - 1) {
            head = head.next;
            count++;
        }
        ListNode left = head;
        ListNode right = head.next;

        ListNode pre = null;
        ListNode cur = head.next;
        ListNode curNext = null;
        int count1 = m;

        while (count1 <= n) {
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
            count1++;
        }
        System.out.printf("rightVal:%d\n",right.val);
        System.out.printf("curNext:%d\n",curNext.val);
        System.out.printf("cur:%d\n",cur.val);

        left.next = cur;
        right.next = curNext;
        return reverseHead;
    }
}