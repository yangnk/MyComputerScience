//package dataStructureAndAlgorithms.oj.ALI;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2022-01-11 21:39
// **/
////2.有三种颜色的灯，红灯、黄灯、绿灯，分别代表三个线程。
////        要求这三盏灯按照红灯、黄灯、绿灯的顺序依次亮起（5s），每盏灯点亮持续时间为5秒中，然后再依次关闭。
////        如此循环。
//
//
//public class ALIYUN2 {
//    //定义亮灯顺序，默认从第一个开始
//    static volatile int order = 1;
//    public static void main(String[] args) {
//        Object lock = new Object();
//        new Thread(new Light(lock,1,2,"red")).start();
//        new Thread(new Light(lock,2,3,"yellow")).start();
//        new Thread(new Light(lock,3,1,"green")).start();
//
//    }
//
//    static class Light implements Runnable {
//        Object lock;
//        int currLight;
//        int nextLight;
//        String color;
//
//        public Light(Object lock, int currLight, int nextLight, String color) {
//            this.lock = lock;
//            this.currLight = currLight;
//            this.nextLight = nextLight;
//            this.color = color;
//        }
//
//        @Override
//        public void run() {
//            //线程加锁，每次仅能一个颜色灯亮起
//            synchronized (lock) {
//                while (true) {
//                    while (currLight != order) {
//                        try {
//                            lock.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    //每个颜色亮灯5s，间隔1s打印一次
//                    Long startTime = System.currentTimeMillis();
//                    while (true) {
//                        Long endTime = System.currentTimeMillis();
//                        if (endTime - startTime > 5000) {
//                            break;
//                        }
//                        System.out.println(color + " light on...");
//                        try {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    //亮灯顺序指向下一个颜色的灯
//                    order = nextLight;
//                    lock.notifyAll();
//                }
//            }
//
//        }
//    }
//}
//
//
