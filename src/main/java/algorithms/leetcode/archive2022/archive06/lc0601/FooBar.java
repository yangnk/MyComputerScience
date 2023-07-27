package algorithms.leetcode.lc0601;


import java.util.concurrent.LinkedBlockingQueue;

class FooBar {
    private int n;
    LinkedBlockingQueue foo = new LinkedBlockingQueue(1);
    LinkedBlockingQueue bar = new LinkedBlockingQueue(1);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            foo.put(1);
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.put(1);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            bar.take();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.take();
        }
    }
}


//
//import java.util.concurrent.BrokenBarrierException;
//import java.util.concurrent.CyclicBarrier;
//
//class FooBar {
//    private int n;
//    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
//    private volatile int flag = 1;
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            while (flag == 0) {}
//            // printFoo.run() outputs "foo". Do not change or remove this line.
//            printFoo.run();
//            flag = 0;
//            try {
//                cyclicBarrier.await();
//            } catch (BrokenBarrierException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            try {
//                cyclicBarrier.await();
//            } catch (BrokenBarrierException e) {
//                e.printStackTrace();
//            }
//            // printBar.run() outputs "bar". Do not change or remove this line.
//            printBar.run();
//            flag = 1;
//        }
//    }
//}


//
//
////yield自旋实现乐观锁
//class FooBar {
//    private int n;
//    private volatile int flag = 0;
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; ) {
//            if (flag == 0) {
//                // printFoo.run() outputs "foo". Do not change or remove this line.
//                printFoo.run();
//                i++;
//                flag = 1;
//            } else {
//                Thread.yield();
//            }
//
//
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; ) {
//            if (flag == 1) {
//                // printBar.run() outputs "bar". Do not change or remove this line.
//                printBar.run();
//                i++;
//                flag = 0;
//            } else {
//                Thread.yield();
//            }
//        }
//    }
//}

//
//
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//

//
////ReentrantLock+Condition
//class FooBar {
//    private int n;
//    private Lock lock = new ReentrantLock(true);
//    private final Condition condition = lock.newCondition();
//    private volatile int flag = 1;
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            lock.lock();
//            try {
//                while (flag == 0) {
//                    condition.await();
//                }
//                // printFoo.run() outputs "foo". Do not change or remove this line.
//                printFoo.run();
//                flag = 0;
//                condition.signal();
//            } finally {
//                lock.unlock();
//            }
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            lock.lock();
//            try {
//                while (flag == 1) {
//                    condition.await();
//                }
//                // printBar.run() outputs "bar". Do not change or remove this line.
//                printBar.run();
//                flag = 1;
//                condition.signal();
//            } finally {
//                lock.unlock();
//            }
//        }
//    }
//}


//import java.util.concurrent.Semaphore;

//
////Semaphore
//class FooBar {
//    private int n;
//    Semaphore semaphore1 = new Semaphore(1);
//    Semaphore semaphore2 = new Semaphore(0);
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            semaphore1.acquire();
//            // printFoo.run() outputs "foo". Do not change or remove this line.
//            printFoo.run();
//            semaphore2.release();
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            semaphore2.acquire();
//            // printBar.run() outputs "bar". Do not change or remove this line.
//            printBar.run();
//            semaphore1.release();
//        }
//    }
//}


// //synchronized+wait()/notify()+flag
//class FooBar {
//    private int n;
//    private final Object foo = new Object();
//    private volatile int flag = 0;
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            synchronized (foo) {
//                while (flag == 1) {
//                    foo.wait();
//                }
//                // printFoo.run() outputs "foo". Do not change or remove this line.
//                printFoo.run();
//                flag = 1;
//                foo.notifyAll();
//            }
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//        for (int i = 0; i < n; i++) {
//
//            synchronized (foo) {
//                while (flag == 0) {
//                    foo.wait();
//                }
//                // printBar.run() outputs "bar". Do not change or remove this line.
//                printBar.run();
//                flag = 0;
//                foo.notifyAll();
//            }
//        }
//    }
//}