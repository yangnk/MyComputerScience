package algorithms.leetcode.lc0609;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;
    private volatile int index = 1;
    private volatile int state = 0;
    Lock lock = new ReentrantLock();
    Condition condition0 = lock.newCondition();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {
            while (index <= n) {
                if (state != 0) {
                    condition0.await();
                }
                printNumber.accept(0);
                if (index % 2 == 0) {
                    state = 2;
                    condition2.signal();
                } else if (index % 2 == 1) {
                    state = 1;
                    condition1.signal();
                }
                ;
                condition0.await();
            }
            condition1.signal();
            condition2.signal();
        } finally {
            lock.unlock();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {
            while (index <= n) {
                if (state != 2) {
                    condition2.await();
                } else {
                    printNumber.accept(index++);
                    state = 0;
                    condition0.signal();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        try {
            while (index <= n) {
                if (state != 1) {
                    condition1.await();
                } else {
                    printNumber.accept(index++);
                    state = 0;
                    condition0.signal();
                }

            }
        } finally {
            lock.unlock();
        }
    }
}