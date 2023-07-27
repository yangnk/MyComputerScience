package algorithms.leetcode.archive01.a0126;
//
//
//开氏度 = 摄氏度 + 273.15
//        华氏度 = 摄氏度 * 1.80 + 32.00

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {

    public static void main(String[] args) {
        double[] doubles = convertTemperature(36.50);

        double dd = -12.344;
        BigDecimal bigDecimal = new BigDecimal(dd);
        double dd1 = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("dd1 = " + dd1);

        System.out.println();

    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
