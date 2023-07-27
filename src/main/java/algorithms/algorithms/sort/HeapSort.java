package algorithms.algorithms.sort;

import java.util.Arrays;

/**
 * @author yangningkai
 * @create 2022-07-13 22:49
 **/

//堆排序，需要两个操作，一个是建堆heapify，另一个是交换swap；中间关注的是需要将堆序号转为从0开始的索引，这样才能使用上二叉树父子关系的公式
//    堆排序：https://zh.m.wikipedia.org/wiki/堆排序
public class HeapSort {
    public static void main(String[] args) {
//        int[] arr = {4, 6, 8, 5, 9};
        int[] arr = {3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] a) {
        int lastIndex = a.length - 1;
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(i, lastIndex, a);
        }
        for (int i = lastIndex; i > 0; i--) {
            swap(0, i, a);
            heapify(0, i - 1, a);
        }
    }

    private static void heapify(int i, int lastIndex, int[] arr) {
        int left = (i << 1) + 1;
        int right = (i << 1) + 2;
        if (left > lastIndex) {
            return;
        }
        int maxIndex = left;
        if (right <= lastIndex && arr[right] > arr[left]) {
            maxIndex = right;
        }
        if (arr[i] < arr[maxIndex]) {
            swap(i, maxIndex, arr);
            heapify(maxIndex, lastIndex, arr);
        }
    }

    private static void swap(int i, int maxIndex, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = tmp;
    }
}
