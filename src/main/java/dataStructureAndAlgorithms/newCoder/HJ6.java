package dataStructureAndAlgorithms.newCoder;

import java.util.Scanner;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-06 22:41
 **/
public class HJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            long inputNum = in.nextLong();
            while (inputNum != 1) {
                for (int i = 2; i <= inputNum; i++) {
                    if (inputNum % i == 0) {
                        inputNum /= i;
                        System.out.print(i + " ");
                        break;
                    }
                    if (i > Math.sqrt(inputNum)) {
                        System.out.print(inputNum + " ");
                        inputNum = 1;
                        break;
                    }
                }
            }

        }
    }
}
