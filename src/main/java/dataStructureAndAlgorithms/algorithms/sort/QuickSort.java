package dataStructureAndAlgorithms.algorithms.sort;

import java.util.Arrays;

/**
 * @author yangningkai
 * @create 2022-07-14 09:49
 **/

//快排的思路是找到一个基准值，将基准值小的放左边，大的放右边，创建i、j两个指针，来回比较最终排序好，排序好的左右数组在递归排序
    //快速排序算法详解（原理、实现和时间复杂度）:http://data.biancheng.net/view/117.html
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 5, 9};
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int left, int right, int[] arr) {
        if (left < right) {
            int pivotValue = arr[left];
            int i = left;
            int j = right;
            while (i < j) {
                while (i < j && pivotValue < arr[j]) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && pivotValue > arr[i]) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = pivotValue;
            quickSort(left, i - 1, arr);
            quickSort(i + 1, right, arr);
        }
    }
}


