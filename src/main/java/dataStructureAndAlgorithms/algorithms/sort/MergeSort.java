package dataStructureAndAlgorithms.algorithms.sort;

import java.util.Arrays;

//排序：https://www.cnblogs.com/guoyaohua/p/8600214.html


/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-09 23:52
 **/
public class MergeSort {
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            }else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] < right[j]) {
                result[index] = left[i++];
            }else {
                result[index] = right[j++];
            }
        }
        return result;
    }

}
