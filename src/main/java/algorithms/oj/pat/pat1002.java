package algorithms.oj.pat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pat1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[1000];
        DecimalFormat df = new DecimalFormat("###.#");
        while (in.hasNext()) {
            int k = in.nextInt();
            for (int i = 0; i < k; i++) {
                int a = in.nextInt();
                double b = in.nextDouble();
                arr[a] = b;
            }

            int k1 = in.nextInt();
            for (int i = 0; i < k1; i++) {
                int a = in.nextInt();
                double b = in.nextDouble();
                arr[a] += b;
            }

            int k2 = 0;
            for (Double item : arr) {
                if (item > 0) {
                    k2++;
                }
            }
            System.out.print(k2);
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > 0) {
                    System.out.print(" " + i + " " + df.format(arr[i]));
                }
            }
            System.out.println();
        }
    }
}
