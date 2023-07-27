package algorithms.leetcode.archive2022.archive12.lc1222;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> list = solution.spiralOrder(a);
        System.out.println("list = " + list);

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        int[] leftUp = {0, 0};
        int[] rightUp = {-1, colNum};
        int[] rightDown = {rowNum, colNum};
        int[] leftDown = {rowNum, -1};
        int x = 0;
        int y = 0;

        while (true) {
            //左到右
            int flag = 0;
            while (y < rightUp[1]) {
                res.add(matrix[x][y]);
                y++;
                flag++;
            }
            if (flag == 0) {
                break;
            } else {
                rightUp[0] = x;
                rightUp[1] = --y;
                x++;
            }

            //上到下
            flag = 0;
            while (x < rightDown[0]) {
                res.add(matrix[x][y]);
                x++;
                flag++;
            }
            if (flag == 0) {
                break;
            } else {
                rightDown[0] = --x;
                rightDown[1] = y;
                y--;
            }

            //右到左
            flag = 0;
            while (y > leftDown[1]) {
                res.add(matrix[x][y]);
                y--;
                flag++;
            }
            if (flag == 0) {
                break;
            } else {
                leftDown[0] = x;
                leftDown[1] = ++y;
                x--;
            }

            //下到上
            flag = 0;
            while (x > leftUp[0]) {
                res.add(matrix[x][y]);
                x--;
                flag++;
            }
            if (flag == 0) {
                break;
            } else {
                leftUp[0] = ++x;
                leftUp[1] = y;
                y++;
            }
        }
        return res;
    }
}
