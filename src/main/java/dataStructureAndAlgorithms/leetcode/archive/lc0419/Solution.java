package dataStructureAndAlgorithms.leetcode.lc0419;

import java.util.HashSet;
import java.util.Set;

//面试题 02.07. 链表相交
//https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    //将headA放入到set中，再讲headB中元素逐个进行比较
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listNodeSet = new HashSet<>();
        while (headA != null) {
            listNodeSet.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (listNodeSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }



//    //求取出两个链表的长度差，再长链表减去长度差后保障和端链表对其，最后同时往后移动，看是否有交汇点
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) {
//            return null;
//        }
//        ListNode currA = headA;
//        ListNode currB = headB;
//        //求差值
//        while (currA != null && currB != null) {
//            currA = currA.next;
//            currB = currB.next;
//        }
//        //headA短headB长，headB后移到对其，再同时向后移动，找到共同节点
//        if (currA == null) {
//            while (currB != null) {
//                currB = currB.next;
//                headB = headB.next;
//            }
//            while (headA != null && headB != null) {
//                if (headB == headA) {
//                    return headA;
//                }
//                headA = headA.next;
//                headB = headB.next;
//            }
//            return null;
//        }else{
//            //headB短headA长，headA后移到对其，再同时向后移动，找到共同节点
//            while (currA != null) {
//                currA = currA.next;
//                headA = headA.next;
//            }
//            while (headA != null && headB != null) {
//                if (headB == headA) {
//                    return headA;
//                }
//                headA = headA.next;
//                headB = headB.next;
//            }
//            return null;
//        }
//    }
}