package dataStructureAndAlgorithms.leetcode;

public class Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reverse(-12300));
    }
    public static int reverse(int x) {
        String oldNum = String.valueOf(x);
        StringBuffer sb = new StringBuffer(oldNum);

        if(sb.charAt(0) == '-'){
            String str = getReverse(sb.substring(1, sb.length()));
            Long my_long = Long.parseLong(str);
            if(my_long < -2147483648 || my_long > 2147483647){
                return 0;
            }
            int a = Integer.parseInt(str);
            return 0 - a;
        }else{
            String str = getReverse(sb.substring(0, sb.length()));
            Long my_long = Long.parseLong(str);
            if(my_long < -2147483648 || my_long > 2147483647){
                return 0;
            }
            int a = Integer.parseInt(str);
            return a;
        }
}

    private static String getReverse(String string) {
        StringBuffer sb = new StringBuffer(string);
        String str1 = sb.reverse().toString();
        return str1;
    }
}
