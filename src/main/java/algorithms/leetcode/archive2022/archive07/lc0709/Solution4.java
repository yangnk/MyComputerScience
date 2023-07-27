package algorithms.leetcode.archive2022.archive07.lc0709;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-07-09 23:34
 **/

public class Solution4 {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        List<NumsItem> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(new NumsItem(nums1[i], nums2[i]));
        }
        Collections.sort(list);
        for (int i = 0; i < k1; i++) {
            if (list.get(0).num1 > list.get(0).num2) {
                list.get(0).num1--;
            } else {
                list.get(0).num1++;
            }
            list.get(0).dif--;
            Collections.sort(list);
            System.out.printf("===list.toString():%s\n", list.toArray().toString());
        }

        for (int i = 0; i < k2; i++) {
            if (list.get(0).num2 > list.get(0).num1) {
                list.get(0).num2--;
            } else {
                list.get(0).num2++;
            }
            list.get(0).dif--;
            Collections.sort(list);
            System.out.printf("======list.toString():%s\n", list.toArray().toString());
        }
        int sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum += Math.pow(list.get(i).dif, 2);
        }
        return sum;
    }

    private class NumsItem implements Comparable<NumsItem>{
        private int num1;
        private int num2;
        private int dif;

        public NumsItem(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
            this.dif = Math.abs(num1 - num2);
        }

        @Override
        public int compareTo(NumsItem o) {
            return o.dif - this.dif;
        }
    }
}
