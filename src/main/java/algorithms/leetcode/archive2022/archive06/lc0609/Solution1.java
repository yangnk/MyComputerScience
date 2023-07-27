package algorithms.leetcode.lc0609;
//
////1116. 打印零与奇偶数:https://leetcode.cn/problems/print-zero-even-odd/
//
////1.0要先打印；
////2.先打印奇数，再打印偶数；
////3.打印到2n个数就停止下来了；
////--->可以用Thread.yield（）实现自旋
//
//import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;
//
//import java.util.function.IntConsumer;
//
//class ZeroEvenOdd {
//    private int n;
//    volatile int state = 0;//控制是否需要打印0
//    volatile int control = 1;//控制0之后是偶数还是奇数，若偶数为2，奇数为1
//
//    public ZeroEvenOdd(int n) {
//        this.n = n;
//    }
//
//    // printNumber.accept(x) outputs "x", where x is an integer.
//    public void zero(IntConsumer printNumber) throws InterruptedException {
//        for (int i = 0; i < n; i++) {
//            while (state != 0) {
//                Thread.yield();
//            }
//            printNumber.accept(0);
//            if (control == 1) {
//                state = 1;
//            } else if (control == 2) {
//                state = 2;
//            }
//        }
//
//    }
//
//    public void even(IntConsumer printNumber) throws InterruptedException {
//        for (int i = 2; i <= n; i += 2) {
//            while (state != 2) {
//                Thread.yield();
//            }
//            printNumber.accept(i);
//            state = 0;
//            control = 1;
//
//        }
//
//    }
//
//    public void odd(IntConsumer printNumber) throws InterruptedException {
//        for (int i = 1; i <= n; i += 2) {
//            while (state != 1) {
//                Thread.yield();
//            }
//            printNumber.accept(i);
//            state = 0;
//            control = 2;
//        }
//
//    }
//}
//


//
//
//
////如何通知到某个特定的线程？
//
//import java.util.function.IntConsumer;
//
//class ZeroEvenOdd {
//    private int n;
//    private volatile int now = 0;
//    private final static Object lock0 = new Object();
//    private final static Object lock1 = new Object();
//
//    public ZeroEvenOdd(int n) {
//        this.n = n;
//    }
//
//    // printNumber.accept(x) outputs "x", where x is an integer.
//    public void zero(IntConsumer printNumber) throws InterruptedException {
//        while (now < n) {
//            synchronized (lock0) {
//                lock0.wait();
//                System.out.print(0);
//                now++;
//                lock1.notify();
//            }
//        }
//    }
//
//    public void even(IntConsumer printNumber) throws InterruptedException {
//        while (now / 2 == 0 && now != 0) {
//            synchronized (lock1) {
//                lock1.wait();
//                System.out.print(now);
////                now++;
//                lock0.notify();
//            }
//        }
//    }
//
//    public void odd(IntConsumer printNumber) throws InterruptedException {
//        while (now / 2 != 0) {
//            synchronized (lock1) {
//                lock1.wait();
//                System.out.print(now);
////                now++;
//                lock0.notify();
//            }
//        }
//    }
//}