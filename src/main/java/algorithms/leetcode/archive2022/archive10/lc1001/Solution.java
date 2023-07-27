package algorithms.leetcode.archive2022.archive10.lc1001;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.reformatNumber("1234567");
        System.out.println("s = " + s);

    }
    public String reformatNumber(String number) {
        StringBuilder ret = new StringBuilder();
        String s = number.replaceAll("\\s|-", "");
        int len = s.length();
        int ptr = 0;
        while (len - ptr > 4) {
            ret.append(s.substring(ptr, ptr + 3)).append("-");
            ptr += 3;
        }
        if (len - ptr == 4) {
            ret.append(s.substring(ptr, ptr + 2)).append("-");
            ptr += 2;
            ret.append(s.substring(ptr, ptr + 2));
        } else if (len - ptr == 3) {
            ret.append(s.substring(ptr, ptr + 3));
        } else if (len - ptr == 2) {
            ret.append(s.substring(ptr, ptr + 2));
        }
        return new String(ret);
    }
}
