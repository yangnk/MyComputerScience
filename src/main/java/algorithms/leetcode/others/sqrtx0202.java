package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-02 22:33
 **/
public class sqrtx0202 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (true) {
            if ((long) (left * left) > x) {
                return left - 1;
            }
            if ((long) (right * right) < x) {
                return right;
            }

            int middle = (left + right) / 2;
            if ((long) (middle * middle) == x) {
                return middle;
            } else if ((long) (middle * middle) > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
    }

//    public int mySqrt(int x) {
//        int[] flagArr = new int[x + 1];
//        int start = 0;
//        int end = x;
//        int middle;
//        flagArr[0] = -1;
//        if (x == 0) {
//            return 0;
//        }
//        if (x == 1) {
//            return 1;
//        }
//        while (true) {
//            middle = (start + end) / 2;
//            if (middle * middle == x) {
//                return middle;
//            }
//            if (middle * middle > x) {
//                flagArr[middle] = 1;
//                if (flagArr[middle - 1] == -1) {
//                    return middle - 1;
//                }
//                end = middle;
//            }
//            if (middle * middle < x) {
//                flagArr[middle] = -1;
//                start = middle;
//                if ((middle + 1) * (middle + 1) > x) {
//                    return middle + 1;
//                }
//            }
//        }
//    }
}
