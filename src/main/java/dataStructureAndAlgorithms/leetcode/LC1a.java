package dataStructureAndAlgorithms.leetcode;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-11 23:03
 **/
public class LC1a {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]]", "").toLowerCase();
        String reverse = new StringBuffer(actual).reverse().toString();
        return actual.equals(reverse);
    }
}
