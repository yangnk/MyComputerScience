package dataStructureAndAlgorithms.newCoder;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-05 08:56
 **/
public class HJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> countMap = new HashMap();
        while (in.hasNextLine()) {
            String inputStr = in.nextLine();
            char inputChar = in.nextLine().charAt(0);
            char[] chars = inputStr.toCharArray();

            for (char ch : chars) {
                char lowerCh = Character.toLowerCase(ch);
                if (!countMap.containsKey(lowerCh)) {
                    countMap.put(lowerCh, 1);
                    continue;
                }
                countMap.put(lowerCh, countMap.get(lowerCh) + 1);
            }
            char lowerInputChar = Character.toLowerCase(inputChar);
            System.out.println(countMap.get(lowerInputChar));

        }
    }
}
