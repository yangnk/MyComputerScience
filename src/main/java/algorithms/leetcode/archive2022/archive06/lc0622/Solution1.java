package algorithms.leetcode.lc0622;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution1 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0) {
            return null;
        }
        if (lists.size() == 1) {
            return lists.get(0);
        }
        return merge(lists, 0, lists.size() - 1);
    }

    private ListNode merge(ArrayList<ListNode> lists, int left, int right) {
        if (left == right) {
            return lists.get(left);
        }
        int mid = left + (right - left) / 2;
        return merge2Lists(merge(lists, left, mid), merge(lists, mid + 1, right));
    }


    private ListNode merge2Lists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
                cur.next = null;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
                cur.next = null;
            }
        }

        cur.next = (list1 == null ? list2 : list1);

        return dummy.next;
    }
}