package algorithms.oj.pat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class pat1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = a + b;
            DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
            String s = decimalFormat.format(sum);
            System.out.println(s);
        }
    }
}
