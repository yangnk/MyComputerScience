package dataStructureAndAlgorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-08-16 下午11:14
 **/
public class RomanToInteger0816 {
    Map<Character, Integer> characterIntegerHashMap = new HashMap() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

    public int romanToInt(String s) {
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int value = characterIntegerHashMap.get(s.charAt(i));
            if (i < len - 1 && (value < characterIntegerHashMap.get(s.charAt(i + 1)))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger0816 romanToInteger0816 = new RomanToInteger0816();
        System.out.println(romanToInteger0816.romanToInt("IX"));
    }
}
