package distributedSystem.limiter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-16 15:27
 **/
public class CounterLimiter {
    private int windowSize; // 窗口大小，毫秒为单位(窗口宽度)
    private int limit;// 窗口内限流大小(窗口容量)
    private AtomicInteger count;// 当前窗口的原子计数器(窗口计数器)

    public CounterLimiter() {
    }

    public CounterLimiter(int windowSize, int limit) {
        this.limit = limit;
        this.windowSize = windowSize;
        count = new AtomicInteger(0);

        // 开启一个线程，达到窗口结束时清空count(每隔一段时间刷新一次窗口的计数器)
        // 相当于Redis的过期时间
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    count.set(0);
                    try {
                        Thread.sleep(windowSize);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    // 请求到达后先调用本方法，若返回true，则请求通过，否则限流
    public boolean tryAcquire() {
        int newCount = count.addAndGet(1);
        return newCount <= limit;
    }

    public static void main(String[] args) throws InterruptedException {
        // 1.构造滑动窗口, 每秒允许20个请求
        CounterLimiter counterLimiter = new CounterLimiter(1000, 20);
        int count = 0;
        // 2.模拟请求
        // 2.1模拟50次请求，看多少能通过
        for (int i = 0; i < 50; i++) {
            if (counterLimiter.tryAcquire()) {
                count++;
            }
        }
        System.out.println("第一拨50次请求中通过：" + count + ",限流：" + (50 - count));
        // 2.2过一秒再请求
        Thread.sleep(1000);
        // 2.3模拟50次请求，看多少能通过
        count = 0;
        for (int i = 0; i < 50; i++) {
            if (counterLimiter.tryAcquire()) {
                count++;
            }
        }
        System.out.println("第二拨50次请求中通过：" + count + ",限流：" + (50 - count));
    }
}
