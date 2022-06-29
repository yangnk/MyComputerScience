package dataStructureAndAlgorithms.algorithms.sort;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-10 17:22
 **/
public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j+1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
