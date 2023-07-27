package dataStructureAndAlgorithms.leetcode.others;

import java.util.Arrays;
import java.util.Scanner;

public class DivisionSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (isRep(i)) {
                continue;
            }
            int prod = i * n;
            if (prod > 0 && prod < 99999) {
                num++;
            }
        }
        System.out.println(num);
    }

    private static boolean isRep(int i) {
        String decStr = Integer.toString(i);
        char[] ch = decStr.toCharArray();
        Arrays.sort(ch);
        if (ch[0] != ch[1] && ch[1] != ch[2] && ch[2] != ch[3] && ch[3] != ch[4]) {
            return false;
        } else {
            return true;
        }
    }
}
