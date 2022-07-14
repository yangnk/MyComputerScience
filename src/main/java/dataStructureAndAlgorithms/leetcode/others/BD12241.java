package dataStructureAndAlgorithms.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-23 23:32
 **/
public class BD12241 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println((int) ch);

        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            arrayList1.add((int) s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            arrayList2.add((int) s2.charAt(i));
        }
        Collections.sort(arrayList1);
        Collections.sort(arrayList2);
        return arrayList2.containsAll(arrayList1);
    }
}
