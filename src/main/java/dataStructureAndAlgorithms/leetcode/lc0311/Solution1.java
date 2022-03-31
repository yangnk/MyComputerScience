package dataStructureAndAlgorithms.leetcode.lc0311;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-11 23:22
 **/
class Solution1 {
    public int findKthNumber(int m, int n, int k) {
        double realNum = Math.sqrt(k);
        double floorNum = Math.floor(Math.sqrt(k));
        double ceilNum = Math.ceil(Math.sqrt(k));
        if (m >= floorNum && n >= floorNum) {
            if (floorNum == realNum) {
                return (int) (floorNum + floorNum);
            }else {
                int leftInt = k - (int) (floorNum * floorNum);
                int index = (leftInt - 1) / 2;
                return (int) ((floorNum + 1) * index);
            }
        }
        return 0;
    }
}
