package dataStructureAndAlgorithms.oj.others.my;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// 请用Java程序实现以下场景
// 1、有二十个账户。每个账户初始余额10000元。
// 2、有十个转账线程，对二十个账户中的两个随机选取账户进行转账，转账额度100以内正整数随机数。
// 3、每个线程执行100次转账操作。
// 4、最后请打印出二十个账户的余额

public class AccountTransfer {
    public static void main(String[] args) {
        Account account = new Account(20, 10000);
        final CountDownLatch countDownLatch = new CountDownLatch(10);

        //创建线程池
        ExecutorService executors = new ThreadPoolExecutor(10, 20, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(20), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        //转账任务加入线程池
        for (int i = 0; i < 10; i++) {
            executors.execute(new TransferThread(countDownLatch, account));
        }
        try {
            //转账完成才打印
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //打印账户余额
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            AtomicInteger finalAccount = account.acountList.get(i);
            System.out.printf("转账后第%d个账户的余额为：%s\n", i + 1, finalAccount.toString());
            sum = finalAccount.addAndGet(sum);
        }
        System.out.printf("转账后账户总额：%d\n", sum);
    }
}

class TransferThread implements Runnable {
    CountDownLatch countDownLatch;
    Account account;

    public TransferThread(CountDownLatch countDownLatch, Account account) {
        this.countDownLatch = countDownLatch;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int from = new Random().nextInt(20);
            int to = new Random().nextInt(20);

            //排除转出账户和转入账户同一个
            if (to == from) {
                from = (to + 1 + 20) % 20;
            }

            AtomicInteger fromAccount = account.acountList.get(from);
            AtomicInteger toAccount = account.acountList.get(to);
            int transferAccount = new Random().nextInt(99) + 1;
            fromAccount.addAndGet(transferAccount);
            toAccount.addAndGet(-transferAccount);
            countDownLatch.countDown();
        }

    }
}


class Account {
    CopyOnWriteArrayList<AtomicInteger> acountList;

    public Account(int nums, int amount) {
        acountList = new CopyOnWriteArrayList<>(new ArrayList<>(nums));

        for (int i = 0; i < nums; i++) {
            AtomicInteger atomicInteger = new AtomicInteger(amount);
            acountList.add(atomicInteger);
        }
    }
}