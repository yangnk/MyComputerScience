package algorithms.leetcode.archive2022.archive09.lc1026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public List<String> fizzBuzz(int n) {
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                res[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                res[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                res[i] = "Buzz";
            } else {
                res[i] = String.valueOf(i + 1);
            }
        }
        return new ArrayList<>(Arrays.asList(res));
    }
}
