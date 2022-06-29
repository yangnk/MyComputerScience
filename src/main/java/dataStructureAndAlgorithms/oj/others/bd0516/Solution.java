package dataStructureAndAlgorithms.oj.others.bd0516;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-16 20:29
 **/
public class Solution {
    public static void main(String[] args) {
        print(13);
    }

    public static void print(int n) {
        //如果n=1
        if (n == 1) {
            System.out.println("(1,1)");
            return;
        }

        int center = n / 2 + 1;
        int x = center;
        int y = center;
        System.out.printf("(%d,%d)",x,y);
        System.out.printf(",(%d,%d)", x + 1, y);
        x = x + 1;
        for (int i = 1; i <= n / 2; i++) {
            //向左
            for (int j = 1; j <= i; j++) {
                y = y - 1;
                System.out.printf(",(%d,%d)",x,y);
            }
            //向上
            for (int j = 1; j <= i + 1; j++) {
                x = x - 1;
                System.out.printf(",(%d,%d)",x,y);
            }
            //向右
            for (int j = 1; j <= i + 1; j++) {
                y = y + 1;
                System.out.printf(",(%d,%d)",x,y);
            }
            //向下
            for (int j = 1; j <= i + 1; j++) {
                x = x + 1;
                System.out.printf(",(%d,%d)",x,y);
            }
            x = x + 1;
        }
    }
}
