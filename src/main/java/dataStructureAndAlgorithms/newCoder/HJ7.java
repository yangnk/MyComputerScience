package dataStructureAndAlgorithms.newCoder;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-07 20:07
 **/
import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String inputStr = in.nextLine();
            String[] splitArr = inputStr.split("\\.");
            int a = Integer.parseInt(splitArr[0]);
            float b = (float) (Float.parseFloat(splitArr[1]) / Math.pow(10, splitArr[1].length()));
            if (b >= 0.5) {
                System.out.println(a + 1);
            }else {
                System.out.println(a);
            }
        }
    }
}