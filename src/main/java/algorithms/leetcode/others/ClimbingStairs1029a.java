package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-10-29 08:06
 **/
public class ClimbingStairs1029a {
    public static void main(String[] args) {
//        System.out.println(climbStairs(1));
//        System.out.println(climbStairs(2));
//        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int[] nums = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

}
