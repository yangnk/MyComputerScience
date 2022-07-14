package dataStructureAndAlgorithms.oj.others.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-24 20:58
 **/

import java.util.Arrays;

public class BD1124 {
    public static void main(String[] args) {
//        int[] input = new int[]{3,1,-3,0};
        int[] input = new int[]{3, 1, -3, 3, 0};
//        int[] input = new int[]{0,0,0,0,0,0,0};
//        input[0] = 0;
//        input[1] = 0;
//        input[2] = 0;

        int[][] output = getNum(input);
//        System.out.println(output.toString());
        print2DNum(output);

    }

    private static void print2DNum(int[][] output) {
        for (int p = 0; p < output.length; p++) {
            for (int q = 0; q < 3; q++) {
                System.out.print(output[p][q]);
            }
            System.out.println();
        }
    }

    static int[][] getNum(int[] input) {
        Arrays.sort(input);
        int[][] output = new int[7][3];
        int sum = 0;
        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                sum = input[i] + input[j];
                leftSum = 0 - sum;
                int k = getExistIndex(j, leftSum, input);
                if (k > 0) {
                    output[count][0] = i;
                    output[count][1] = j;
                    output[count][2] = k;
                }
            }
        }
        return output;
    }

    static int getExistIndex(int j, int leftSum, int[] input) {
        for (int index = j + 1; index < input.length; index++) {
            if (input[index] == leftSum) {
                return index;
            }
        }
        return -1;
    }
}