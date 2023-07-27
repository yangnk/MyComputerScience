package algorithms.leetcode.archive2022.archive08.lc0828;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> listList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            listList.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        Collections.sort(listList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int index = 1;
        while (listList.size() > index) {
            if (listList.get(index - 1)[1] >= listList.get(index)[0]) {
                listList.get(index)[1] = listList.get(index - 1)[1] >= listList.get(index)[1] ?
                        listList.get(index - 1)[1] : listList.get(index)[1];
                listList.get(index)[0] = listList.get(index - 1)[0] <= listList.get(index)[0] ?
                        listList.get(index - 1)[0] : listList.get(index)[0];
                listList.remove(index - 1);
                continue;
            }
            index++;
        }
        int[][] ans = new int[listList.size()][2];
        for (int i = 0; i < listList.size(); i++) {
            ans[i][0] = listList.get(i)[0];
            ans[i][1] = listList.get(i)[1];
        }
        return ans;
    }


//    public int[][] merge(int[][] intervals) {
//        if (intervals.length == 0 || intervals.length == 1) {
//            return intervals;
//        }
//        List<List<Integer>> listList = new ArrayList<>();
//        for (int i = 0; i < intervals.length; i++) {
//            List<Integer> pair = new ArrayList<>();
//            pair.add(intervals[i][0]);
//            pair.add(intervals[i][1]);
//            listList.add(pair);
//        }
//        Collections.sort(listList, new Comparator<List<Integer>>() {
//            @Override
//            public int compare(List<Integer> o1, List<Integer> o2) {
//                return o1.get(0) - o2.get(0);
//            }
//        });
//        int index = 1;
//        while (listList.size() > index) {
//            if (listList.get(index - 1).get(1) >= listList.get(index).get(0)) {
//                int right = listList.get(index - 1).get(1) >= listList.get(index).get(1) ?
//                        listList.get(index - 1).get(1) : listList.get(index).get(1);
//                int left = listList.get(index - 1).get(0) <= listList.get(index).get(0) ?
//                        listList.get(index - 1).get(0) : listList.get(index).get(0);
//                listList.get(index).set(1, right);
//                listList.get(index).set(0, left);
//                listList.remove(index - 1);
//                continue;
//            }
//            index++;
//        }
//        int[][] ans = new int[listList.size()][2];
//        for (int i = 0; i < listList.size(); i++) {
//            ans[i][0] = listList.get(i).get(0);
//            ans[i][1] = listList.get(i).get(1);
//        }
//        return ans;
//    }
}
