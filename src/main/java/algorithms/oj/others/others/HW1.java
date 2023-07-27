package algorithms.oj.others.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-21 19:40
 **/
public class HW1 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 4, 7, 11};
        System.out.println(getKNum(a, 5));
        System.out.println(getKNumNew(a, 5));

    }

    public static int getKNum(int[] ints, int k) {
        int[] result = new int[k];
        int flag = 0;
        int num = 1;

        for (int i = 0; i < k; i++) {
            if (flag < ints.length && ints[flag] != num) {
                result[i] = num;
                num++;
            }
            flag++;
            num++;
        }
        return num;
    }

    public static int getKNumNew(int[] ints, int k) {
        int flag = 0;
        int num = 1;

        for (int i = 0; i < k; i++) {
            if (flag < ints.length && ints[flag] != num) num++;
            flag++;
            num++;
        }
        return num;
    }
}
