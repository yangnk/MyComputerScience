package algorithms.leetcode.archive2022.archive07.lc0723;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        long l = solution2.zeroFilledSubarray(new int[]{0, 0, 0, 2, 0, 0});
        System.out.println(l);

    }

    public long zeroFilledSubarray(int[] nums) {
        int start = 0;
        long sum = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                if (end != 0 && nums[end - 1] != 0) {
                    start = end;
                }
                if (end == nums.length - 1) {
                    sum += getCount(end - start + 1);
                }
                continue;
            }
            if (end != 0 && nums[end - 1] != 0) {
                start = end;
                continue;
            }
            sum += getCount(end - start);
        }
        return sum;
    }

    public long getCount(long count) {
        return ((1 + count) * count) / 2;
    }
}
