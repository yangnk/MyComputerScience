package algorithms.leetcode.archive2022.archive07.lc0727;

public class Solutiona {
    String result = "";
    char[] chars;

    public String decodeString(String s) {
        chars = s.toCharArray();
        return recursion(s, 0);
    }

    private String recursion(String s, int ptr) {
        if (ptr == s.length() || chars[ptr] == ']') {
            return "";
        }
        String tmp = "";

        if (Character.isLetter(chars[ptr])) {
            result += String.valueOf(chars[ptr++]);
        } else if (Character.isDigit(chars[ptr])) {
            int sum = chars[ptr] - '0';
            while (Character.isDigit(chars[ptr++])) {
                sum += sum * 10 + (chars[ptr] - '0');
            }
            ptr++;
            String s1 = recursion(s, ptr);
            ptr++;
            for (int i = 0; i < sum; i++) {
                result += new String(s1);
            }
        }
        return result + recursion(s, ptr);
    }

}
