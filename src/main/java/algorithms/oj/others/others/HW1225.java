package algorithms.oj.others.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-25 14:53
 **/

//问题描述：
//        给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
//        例如，如果这个列表是 [“same”, “me”, “bell”]，我们就可以将其表示为 S = “same#bell#” 和 indexes = [0, 2, 5]。
//        对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 “#” 结束，来恢复我们之前的单词列表。
//        那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
//        示例1：
//        输入： words = ["same", "me", "bell"]
//        输出：10
//        说明：S= "same#bell#"，indexes=[0,2,5]
//        示例2：
//        输入： words = ["bell", "me", "same", "bell"]
//        输出：10
//        说明：S= "bell#same#"，indexes=[0,7,5,0]
//        提示：
//        1.	 1 <= words.length <= 2000
//        2.	1 <= words[i].length < =7
//        3.	每个单词都是小写字母

public class HW1225 {
    public static void main(String[] args) {
        String[] string = {"bell", "me", "same", "bell"};
        System.out.println(getMaxLenNum(string));
    }

    public static int getMaxLenNum(String[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(input[0]).append("#");

        for (int i = 1; i < input.length; i++) {
            if (input[i - 1].lastIndexOf(input[i]) == input[i - 1].length() - input[i].length()) {
                continue;
            }
            if (input[i].lastIndexOf(input[i - 1]) == input[i].length() - input[i - 1].length()) {
                stringBuffer.delete(stringBuffer.length() - input[i - 1].length(), stringBuffer.length() - 1);
                stringBuffer.append(input[i]).append("#");
            }
            stringBuffer.append(input[i]).append("#");
        }
        return stringBuffer.length();
    }
}
