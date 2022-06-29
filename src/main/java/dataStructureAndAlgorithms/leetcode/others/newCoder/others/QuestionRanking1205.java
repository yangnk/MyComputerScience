package dataStructureAndAlgorithms.leetcode.newCoder.others;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-05 08:16
 **/
public class QuestionRanking1205 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String inputStr = in.nextLine();
            String[] strArr = inputStr.split("\\s+");
            List<String> strList  = Arrays.asList(strArr);
            String ouputStr = strList.get(strArr.length - 1);
            System.out.println(ouputStr.length());
        }
    }
}
