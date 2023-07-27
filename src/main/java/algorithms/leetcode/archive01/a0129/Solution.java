package algorithms.leetcode.archive01.a0129;


//29. 两数相除 https://leetcode.cn/problems/divide-two-integers/solutions/?favorite=2ckc81c
public class Solution {


    public static void main(String[] args) {
//        int a = 9;
//        a <<= 1;
//        System.out.println("a = " + a);
//        int time = getTime(123, 10);
//        System.out.println("time = " + time);
        int divide = divide(7, -3);
        System.out.println("divide = " + divide);

    }

    public static int divide(int dividend, int divisor) {
        int sum = 0;
        int flag = 1;
        if (divisor < 0) {
            divisor = -divisor;
            flag = -1;
        }
        while (true) {
            int time = getTime(dividend, divisor);
            dividend = dividend - time * divisor;
            sum += time;
            if (time == 0) {
                break;
            }
        }
        if (flag == -1) {
            return -sum;
        } else {
            return sum;
        }
//        return sum;

    }

    //a=100, b=9
    private static int getTime(int a, int b) {

        if (a < b) {
            return 0;
        }

        int time = 0;
        while (true) {
            if (b >= a) {
                break;
            }
            b <<= 1;
            time++;
        }
        return 1 << (time - 1);
    }

}
