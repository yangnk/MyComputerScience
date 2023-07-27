package dataStructureAndAlgorithms.leetcode.lc0708;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yangningkai
 * @create 2022-07-08 10:34
 **/

public class Solution {
    public static void main(String[] args) {
//        int[][] signals = {{0, 40}, {10, 15}, {5, 30}};
        int[][] signals = {{19,20},{1,10},{5,14}};
        canReceiveAllSignals(signals);

    }

    static public boolean canReceiveAllSignals(int[][] intervals) {
        List<Peer> peerList = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            Peer item = new Peer(intervals[i][0], intervals[i][1]);
            peerList.add(item);
        }
        Collections.sort(peerList);
        for (int i = 0; i < intervals.length - 1; i++) {
            if (peerList.get(i).end > peerList.get(i + 1).start) {
                return false;
            }
        }
        return true;
    }

    private static class Peer implements Comparable<Peer>{
        int start;
        int end;

        public Peer(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Peer o) {
            return this.start - o.start;
        }
    }
}
