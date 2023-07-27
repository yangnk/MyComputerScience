//package algorithms.oj.pat;
//
//import java.text.DecimalFormat;
//import java.util.*;
//
//public class pat1011 {
//    static int quota0 = 1;
//    static int quota1 = 2;
//    //    static List<Double> list0 = null;
////    static List<Double> list1 = null;
//    static TreeMap<Double, Integer> map0 = null;
//    static TreeMap<Double, Integer> map1 = null;
//
//
//    public static <list1> void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Double[][] arr = new Double[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = in.nextDouble();
//            }
//        }
//
////        list0 = new ArrayList();
////        list1 = new ArrayList();
//        map0 = new TreeMap<Double, Integer>(new Comparator<Double>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                return o2 - o1 > 0 ? 1 : -1;
//            }
//        });
//        map1 = new TreeMap<Double, Integer>(new Comparator<Double>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                return o2 - o1 > 0 ? 1 : -1;
//            }
//        });
//        for (int i = 0; i < 3; i++) {
////            list0.add(arr[i][0]);
//            map0.put(arr[i][0], i);
//        }
//        for (int i = 0; i < 3; i++) {
////            list1.add(arr[i][1]);
//            map1.put(arr[i][0], i);
//        }
////        Collections.sort(list0, new Comparator<Double>() {
////
////            @Override
////            public int compare(Double o1, Double o2) {
////                return o2 - o1 > 0 ? 1 : -1;
////            }
////        });
////        Collections.sort(list1, new Comparator<Double>() {
////            @Override
////            public int compare(Double o1, Double o2) {
////                return o2 - o1 > 0 ? 1 : -1;
////            }
////        });
//        double d1 = getMaxOdd();
//        double d2 = getMaxOdd();
//        double d3 = getMaxOdd();
//        double ans = (d1 * d2 * d3 * 0.65 - 1) * 2;
//        DecimalFormat df = new DecimalFormat("###.##");
//        String format = df.format(ans);
//        System.out.println(format);
//    }
//
//    private static double getMaxOdd() {
//        if (quota0 > 0 && quota1 > 0) {
//            if (map0.get(0) - map1.get(0) > 0) {
//                double ans = map0.get(0);
////                map0.remove(0);
//                map0.firstEntry().getValue();
//                quota0--;
//                return ans;
//            } else {
//                double ans = list1.get(0);
//                list1.remove(0);
//                quota1--;
//                return ans;
//            }
//        } else if (quota0 == 0) {
//            double ans = list1.get(0);
//            list1.remove(0);
//            quota1--;
//            return ans;
//        } else if (quota1 == 0) {
//            double ans = list0.get(0);
//            list0.remove(0);
//            quota0--;
//            return ans;
//        }
//        return 0;
//    }
//}
