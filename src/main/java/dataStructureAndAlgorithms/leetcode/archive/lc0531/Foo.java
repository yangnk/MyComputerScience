package dataStructureAndAlgorithms.leetcode.lc0531;


import java.util.concurrent.CountDownLatch;

class Foo {
    CountDownLatch first = new CountDownLatch(1);
    CountDownLatch second = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        first.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        second.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        second.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}


//
//
//class Foo {
//    private volatile int flag = 1;
//    private final Object lock = new Object();
//
//    public Foo() {
//
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//        synchronized (lock) {
//            while (flag == 1) {
//                lock.wait();
//            }
//
//            // printFirst.run() outputs "first". Do not change or remove this line.
//            printFirst.run();
//            flag = 2;
//            lock.notifyAll();
//        }
//
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//
//        synchronized (lock) {
//            while (flag == 2) {
//                lock.wait();
//            }
//        }
//        // printSecond.run() outputs "second". Do not change or remove this line.
//        printSecond.run();
//        flag = 3;
//        lock.notifyAll();
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//        synchronized (lock) {
//            while (flag == 3) {
//                lock.wait();
//            }
//        }
//        // printThird.run() outputs "third". Do not change or remove this line.
//        printThird.run();
//    }
//}
//
//
//import java.util.concurrent.Semaphore;
//
//class Foo {
//    Semaphore secondSemaphore = new Semaphore(0);
//    Semaphore firstSemaphore = new Semaphore(0);
//
//    public Foo() {
//
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//
//        // printFirst.run() outputs "first". Do not change or remove this line.
//        printFirst.run();
//        secondSemaphore.release();
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//        secondSemaphore.acquire();
//        // printSecond.run() outputs "second". Do not change or remove this line.
//        printSecond.run();
//        firstSemaphore.release();
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//        firstSemaphore.acquire();
//        // printThird.run() outputs "third". Do not change or remove this line.
//        printThird.run();
//    }
//}

//
//class Foo {
//    AtomicInteger firstDone = new AtomicInteger();
//    AtomicInteger secondDone = new AtomicInteger();
//
//    public Foo() {
//
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//
//        // printFirst.run() outputs "first". Do not change or remove this line.
//        printFirst.run();
//        firstDone.addAndGet(1);
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//        while (firstDone.get() != 1) {
//
//        }
//
//        // printSecond.run() outputs "second". Do not change or remove this line.
//        printSecond.run();
//        secondDone.addAndGet(1);
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//        while (secondDone.get() != 1) {
//
//        }
//
//        // printThird.run() outputs "third". Do not change or remove this line.
//        printThird.run();
//    }
//}