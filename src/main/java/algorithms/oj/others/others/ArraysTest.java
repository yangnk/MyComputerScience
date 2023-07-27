package algorithms.oj.others.others;

import java.util.Arrays;
import java.util.Collections;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-24 23:08
 **/
public class ArraysTest {
    public static void main(String[] args) {
        //填充
//        int[] intA = new int[4];
//        Arrays.fill(intA, 0);
//        String str = Arrays.toString(intA);
//        System.out.println(str);
        //  排序
        Integer[] intArray = new Integer[]{4, 1, 3, -23};
//        Arrays.sort(intArray, Collections.reverseOrder());
//        String str = Arrays.toString(intArray);
//        System.out.println(str);

        int binarySearch = Arrays.binarySearch(intArray, 100);
//        System.out.println(binarySearch);
        Integer[] intArray1 = Arrays.copyOf(intArray, 2);
        String str = Arrays.toString(intArray1);
        System.out.println(str);

    }
}
