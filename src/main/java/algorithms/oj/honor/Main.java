//package algorithms.oj.honor;
//
//import java.util.*;
//
//public class Main {
//
//
//    static List<String> list = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String inputStr = in.nextLine();
//
//        String[] strings = inputStr.split("\\s");
//
//        for (int i = 1; i < strings.length; i++) {
//            split8char(strings[i]);
//        }
//
//        Collections.sort(list);
//        StringBuilder printStr = new StringBuilder();
//        printStr.append(list.get(0));
//        for (int i = 1; i < list.size(); i++) {
//            printStr.append(" ");
//            printStr.append(list.get(i));
//        }
//        System.out.println(printStr);
//    }
//
//    private static void split8char(String eleStr) {
//        int mod = eleStr.length() % 8;
//        int ans = eleStr.length() / 8;
//        for (int i = 0; i < ans; i++) {
//            list.add(eleStr.substring(i * 8, (i + 1) * 8));
//        }
//        if (mod != 0) {
//            String substring = eleStr.substring(ans * 8) + "00000000";
//            String s = substring.substring(0, 8);
//            list.add(s);
//        }
//    }
//}
