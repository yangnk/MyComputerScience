package dataStructureAndAlgorithms.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-28 23:58
 **/

//int和Integer的转化 --->  https://blog.csdn.net/ASDQWE09876/article/details/79271992

public class BD1228 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
//        int[] arrInt = new int[]{};
        Integer[] IntegerNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        ArrayList<Integer> IntegerList = new ArrayList(nums.length);
        Collections.addAll(IntegerList, IntegerNums);

//        arrInt = Arrays.stream(IntegerNums).mapToInt(Integer::valueOf).toArray();
        return IntegerList.indexOf(target);
    }
}
