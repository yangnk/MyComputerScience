package dataStructureAndAlgorithms.algorithms.sort;

import java.util.Arrays;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-09 23:52
 **/

//堆排序是分治法的实现，将数组先划分为左右两个子数组，再递归划分，划分到一个元素再进行排序，主要的处理在对两个有序子数组进行排序
//排序：https://www.cnblogs.com/guoyaohua/p/8600214.html

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 5, 9};
        int[] sortedArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
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
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] < right[j]) {
                result[index] = left[i++];
            } else {
                result[index] = right[j++];
            }
        }
        return result;
    }
}
