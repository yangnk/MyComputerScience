package algorithms.oj.pat;

import java.util.Scanner;

public class pat1008 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = in.nextInt();
        }
        int output = 0;
        for (int i = 0; i < num; i++) {
            int dif = 0;
            if (i == 0) {
                dif = 0 - arr[0];
            } else {
                dif = arr[i - 1] - arr[i];
            }

            if (dif > 0) {
                output += dif * 4;
            } else {
                output += (-dif) * 6;
            }
        }
        output += num * 5;
        System.out.print(output);
    }

}
