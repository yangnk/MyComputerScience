package dataStructureAndAlgorithms.algorithms.others;

public class dpSample {
    public static void main(String[] args) {
        int[] a = new int[]{-2, 4, 0, 3, 5, 8, -1};
        System.out.println(getMaxProducteSubstring(a));
        System.out.println(getMaxProducteSubstring1(a));
    }

    public static int getMaxProducteSubstring(int[] arr) {
        int len = arr.length;
        int start = 0, end = 0;
        int my_max = Integer.MIN_VALUE;
        for (int i = 0; i < len - 1; i++) {
            int prod = 1;
            for (int j = i; j < len - 1; j++) {
                prod *= arr[j];
                if (prod > my_max) {
                    my_max = prod;
                    start = i;
                    end = j;
                }
            }
        }
        return my_max;
    }

    public static int getMaxProducteSubstring1(int[] arr) {
        int len = arr.length;
        int[] min_dp = new int[len];
        int[] max_dp = new int[len];
        int my_max = Integer.MIN_VALUE;
        min_dp[0] = max_dp[0] = arr[0];
        for (int i = 1; i < len; i++) {
            min_dp[i] = Math.min(arr[i], Math.min((min_dp[i - 1] * arr[i]), (max_dp[i - 1] * arr[i])));
            max_dp[i] = Math.max(arr[i], Math.max((min_dp[i - 1] * arr[i]), (max_dp[i - 1] * arr[i])));
            my_max = my_max < max_dp[i] ? max_dp[i] : my_max;
        }
        return my_max;
    }
}