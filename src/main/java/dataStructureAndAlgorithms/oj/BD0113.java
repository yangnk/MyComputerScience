package dataStructureAndAlgorithms.oj;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-13 20:56
 **/

//起点(2,4)
//        终点(4,4)
//        0 0 1 0 0
//        0 0 2 0 0
//        0 0 3 4 0
//        0 0 6 5 6
//        0 2 7 8 9

public class BD0113 {
    public static int startX = 2;
    public static int startY = 4;
    public static int EndX = 4;
    public static int EndY = 4;
    public static int[][] arr =
            {{0, 0, 1, 0, 0},
            {0, 0, 2, 0, 0},
            {0, 0, 3, 4, 0},
            {0, 0, 6, 5, 6},
            {0, 2, 7, 8, 9},};
    public static int count = 0;

    public static void main(String[] args) {
        searchPath(startX, startY);
        System.out.println(count);
    }

    public static void searchPath(int x, int y) {
        if (x == EndX && y == EndY) {
            count++;
        }
        if (y + 1 < arr[0].length && arr[x][y + 1] > arr[x][y]) {
            searchPath(x, y + 1);
        } else if (y - 1 >= 0 && arr[x][y - 1] > arr[x][y]) {
            searchPath(x, y - 1);
        } else if (x + 1 < arr.length && arr[x + 1][y] > arr[x][y]) {
            searchPath(x + 1, y);
        } else if (x - 1 >= 0 && arr[x - 1][y] > arr[x][y]) {
            searchPath(x - 1, y);
        }
    }
}
