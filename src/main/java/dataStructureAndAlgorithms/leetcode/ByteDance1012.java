package dataStructureAndAlgorithms.leetcode;

import java.util.HashSet;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-07-17 上午11:31
 **/
public class ByteDance1012 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        System.out.println(hashSet.size());
        hashSet.add("2");
        System.out.println(hashSet.size());
    }

    public static boolean isRepeat(HashSet hs, String a) {
        int startSize = hs.size();
        hs.add(a);
        int endSize = hs.size();
        if (startSize == endSize) {
            return true;
        }else {
            return false;
        }
    }
}


