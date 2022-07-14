package distributedSystem.limiter;

/**
 * @author yangningkai
 * @create 2022-06-16 15:27
 **/

import com.google.common.util.concurrent.RateLimiter;

public class RateLimiterTest {

    public static void main(String[] args) {
        // 创建了一个每秒生成10个令牌的限流器，即100ms生成一个，并最多保存10个令牌，多余的会被丢弃
        RateLimiter rateLimiter = RateLimiter.create(1);
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    rateLimiter.acquire();
                    System.out.println(System.currentTimeMillis());
                    System.out.println("do something...");

                }
            }).start();
        }
    }

}