package algorithms.leetcode.lc0609;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public boolean isBoomerang(int[][] points) {
        List<Double> list = new ArrayList<>();
        //获取两点间长度
        list.add(get2PointLength(points[0], points[1]));
        list.add(get2PointLength(points[0], points[2]));
        list.add(get2PointLength(points[1], points[2]));
        Collections.sort(list);

        //判断是否非三角形
        if (list.get(0) + list.get(1) - list.get(2) < Math.pow(10, -5)) {

            return false;
        } else {
            return true;
        }
    }

    //计算两点的距离
    private double get2PointLength(int[] point1, int[] point2) {
        double num1 = Math.pow(Double.valueOf(point1[0]) - Double.valueOf(point2[0]), 2);
        double num2 = Math.pow(Double.valueOf(point1[1]) - Double.valueOf(point2[1]), 2);
        double length = Math.sqrt(num1 + num2);
        return length;
    }
}