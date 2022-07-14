package dataStructureAndAlgorithms.leetcode.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-13 19:50
 **/

//给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。


//Definition for singly-linked list.
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

public class DB0113 {
    public ListNode sortList(ListNode head) {
        List<Integer> sortedList = new ArrayList<>();
        if (head == null) {
            return null;
        }
        while (head != null) {
            sortedList.add(head.val);
            head = head.next;
        }
        Collections.sort(sortedList);
        ListNode resultHead = new ListNode();
        ListNode resultTail = resultHead;
        for (Integer item : sortedList) {
            ListNode tmp = new ListNode();
            tmp.val = item;
            resultTail.next = tmp;
            resultTail = resultTail.next;
        }
        return resultHead.next;
    }
}
