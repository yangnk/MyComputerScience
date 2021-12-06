package dataStructureAndAlgorithms.leetcode;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-10-12 07:58
 **/

//todo 还有问题，思路没问题
public class MaximumSubarray1012 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int leftOrRight = -1;

        //求子数组左右下标
        while (start < end) {
            int flag;

            if (leftOrRight == -1) {
                flag = start;
                int sum = nums[flag];
                while (flag <= end) {
                    int newSum = sum + nums[flag + 1];
                    if (sum >= newSum) {
                        sum = newSum;
                        flag++;
                        System.out.printf("1.===%d===",sum);
                    }else {
                        start = flag + 1;
                        break;
                    }
                }
                leftOrRight = 1;
                continue;
            }
            if(leftOrRight == 1) {
                flag = end;
                int sum = nums[flag];
                while (flag >= start) {
                    int newSum = sum + nums[flag - 1];
                    if (sum >= newSum) {
                        sum = newSum;
                        flag--;
                        System.out.printf("2.===%d===",sum);
                    }else {
                        end = flag - 1;
                        break;
                    }
                }
                leftOrRight = -1;
                continue;
            }
        }

        //计算子数组和
        int maxSubStr = nums[start];
        for (int i = start; i < end; i++) {
            maxSubStr = maxSubStr + nums[i];
        }
        return maxSubStr;
    }
}
