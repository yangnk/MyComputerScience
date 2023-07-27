package algorithms.oj.pat;

import java.util.Scanner;

public class pat1005 {
    public static void main(String[] args) {
        String[] numEnum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        String s = String.valueOf(input);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            int val = chars[i] - '0';
            sum += val;
        }
        String s1 = String.valueOf(sum);
        char[] chars1 = s1.toCharArray();
        String output = "";
        for (int i = 0; i < chars1.length; i++) {
            int val1 = chars1[i] - '0';
            String s2 = numEnum[val1] +" ";
            output += s2;
        }
        System.out.println(output.substring(0, output.length() - 1));
    }
}
