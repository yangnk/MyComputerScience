package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-13 23:36
 **/
public class ArrayAndSorting1213 {
    public static void main(String[] args) {
        int[][] grid ={{0,1},{1,1}};
        ArrayAndSorting1213 arrayAndSorting1213 = new ArrayAndSorting1213();
        int maxAreaOfIsland = arrayAndSorting1213.maxAreaOfIsland(grid);
        System.out.println(maxAreaOfIsland);

    }

    public int maxAreaOfIsland(int[][] grid) {
        int rowNum = grid.length;
        int lineNum = grid[0].length;
        int area = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < lineNum; j++) {
                if (grid[i][j] == 1) {
                    int tmp = getArea(grid, new Coordinate(i, j));
                    area = tmp > area ? tmp : area;
                }
            }
        }
        return area;
    }

    private int getArea(int[][] grid, Coordinate coordinate) {
        int x = coordinate.x;
        int y = coordinate.y;
        int area = 1;
        grid[x][y] = 0;
        if (y - 1 >= 0 && grid[x][y - 1] == 1) {
            grid[x][y - 1] = 0;
            area += getArea(grid, new Coordinate(x, y - 1));
        }
        if (y + 1 < grid[0].length && grid[x][y + 1] == 1) {
            grid[x][y + 1] = 0;
            area += getArea(grid, new Coordinate(x, y + 1));
        }
        if (x - 1 >= 0 && grid[x - 1][y] == 1) {
            grid[x - 1][y] = 0;
            area += getArea(grid, new Coordinate(x - 1, y));
        }
        if (x + 1 < grid.length && grid[x + 1][y] == 1) {
            grid[x + 1][y] = 0;
            area += getArea(grid, new Coordinate(x + 1, y));
        }

        return area;
    }

    class Coordinate {
     int x;
     int y;
        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
