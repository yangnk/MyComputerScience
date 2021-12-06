package dataStructureAndAlgorithms.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-12 00:10
 **/
public class IntersectionOfTwoLinkedLists1111 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> mySet = new HashSet<ListNode>();
        ListNode tmpA = headA;

        while(tmpA != null){
            mySet.add(tmpA);
            tmpA = tmpA.next;
        }

        ListNode tmpB = headB;
        while (tmpB != null) {
            if (mySet.contains(tmpB)) {
                return tmpB;
            }
            tmpB = tmpB.next;
        }
        return null;
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

