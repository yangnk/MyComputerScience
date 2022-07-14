package dataStructureAndAlgorithms.algorithms.others;

public class DPDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 4, 8, 6, 7};
        System.out.println(getMaxSubstring(arr));
    }

    public static int getMaxSubstring(int[] arr) {
        int len = arr.length;
        int[] dp = new int[len];
        //初始化 i = 0， i = 2；
        dp[0] = 1;
        dp[1] = (arr[1] >= arr[0]) ? 2 : 1;
        int myMax = Integer.MIN_VALUE;
        //dp
        for (int i = 2; i < len; i++) {
            for (int j = 0; j <= i - 2; j++) {
                myMax = (dp[j] > myMax) ? dp[j] : myMax;
            }
            if (arr[i] >= arr[i - 1]) {
                myMax = (dp[i - 1] + 1 > myMax) ? dp[i - 1] + 1 : myMax;
            }
            dp[i] = myMax;
        }
        return myMax;
    }
}
