package algorithms.leetcode.archive2022.archive12.lc1224;

public class Solution1 {
    public int captureForts(int[] forts) {
        //找到第一个1|-1-->通过快慢指针向右走，当快慢指针和为0，和最大值做比较
        int slow = 0;
        int fast = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                slow = i;
                fast = i;
                break;
            }
        }
        int max = 0;
//        while (true) {
//            if (fast >= forts.length) {
//                break;
//            }
//            if (forts[slow] + forts[fast] == 0) {
//                if (fast - slow - 1 > max) {
//                    max = fast - slow - 1;
//                }
//                slow = fast;
//            }
//            if (forts[slow] != 0 && forts[fast] != 0) {
//                slow = fast;
//            }
//            fast++;
//        }

        for (; fast < forts.length; fast++) {
            if (forts[slow] + forts[fast] == 0) {
                if (fast - slow - 1 > max) {
                    max = fast - slow - 1;
                }
                slow = fast;
            }
            if (forts[slow] != 0 && forts[fast] != 0) {
                slow = fast;
            }
        }

        return max;
    }
}
