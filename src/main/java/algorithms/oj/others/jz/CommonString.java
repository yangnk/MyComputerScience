package algorithms.oj.others.jz;

//2. 写一个算法查找两个字符串中公共最大的字符串。
//        如： abcdefabcd abefabghi 找出: efab。

public class CommonString {
    public static void main(String[] args) {
        String s = getCommenString("abcdefabcd", "abefabghi");
        System.out.println("max common string:" + s);
    }

    private static String getCommenString(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] dp = new int[c1.length + 1][c2.length + 1];
        int max = 0;
        int num = 0;
        StringBuffer sb = new StringBuffer();
        //得到dp数组
        for (int i = 1; i < c1.length + 1; i++) {
            for (int j = 1; j < c2.length + 1; j++) {
                if (c1[i - 1] == c2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        //根据dp数组定位字符串位置
        if (c1.length < c2.length)
            for (int i = 0; i < c1.length; i++)
                for (int j = 0; j < c2.length; j++) {
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        num = i;
                    }
                }
        else {
            for (int i = 0; i < c2.length; i++)
                for (int j = 0; j < c1.length; j++) {
                    if (dp[j][i] > max) {
                        max = dp[j][i];
                        num = j;
                    }
                }
        }
        for (int i = num - max; i < num; i++) {
            sb.append(c1[i]);
        }
        return sb.toString();
    }
}
