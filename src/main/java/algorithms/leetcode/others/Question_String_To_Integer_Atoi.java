package dataStructureAndAlgorithms.leetcode.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-04-11 下午10:22
 **/
public class Question_String_To_Integer_Atoi {
    public static void main(String[] args) {
//        String string = "4193 with words";
//        char ch = string.charAt(7);
////        int a = Integer.parseInt(string.trim());
//        System.out.println(ch >= '0' && ch <= '9');
//        BigInteger bigInteger = new BigInteger("-111111111111111");
//        bigInteger.compareTo(BigInteger.valueOf(Integer.MAX_VALUE));
//
//        System.out.println(bigInteger);
        System.out.println(myAtoi("-"));
//        Integer.valueOf("-91283472332");
//        System.out.println(Long.MAX_VALUE);
//        System.out.println("21474836111333".compareTo(String.valueOf(Integer.MAX_VALUE)));
    }


    public static int myAtoi(String str) {
        //前置校验
        if (str == "" || str == "-") {
            return 0;
        }

        //获取整数字符串
        String string1 = str.trim();
        int flag = 0;
        char ch;
        while (flag < string1.length()) {
            if ((ch = string1.charAt(flag)) >= '0' && ch <= '9' || ch == '-') {
                flag++;
                continue;
            }
            break;
        }
        if (flag == 0) {
            return 0;
        }

        String string2 = string1.substring(0, flag);//整数字符串

        if ((string2.charAt(0) == '-' && string2.length() > String.valueOf(Integer.MIN_VALUE).length()) || (string2.length() == String.valueOf(Integer.MIN_VALUE).length() && string2.compareTo(String.valueOf(Integer.MIN_VALUE)) < 0)) {
            return Integer.MIN_VALUE;
        }
        if (string2.length() > String.valueOf(Integer.MAX_VALUE).length() || (string2.length() == String.valueOf(Integer.MIN_VALUE).length() && string2.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0)) {
            return Integer.MAX_VALUE;
        }

        return Integer.valueOf(string2);
    }
}
