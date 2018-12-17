package designPattaren.singleInstance;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 上午9:52
 **/
public class TestLoadBalancer {
    public static void main(String[] args) throws InterruptedException {
        //饿汉式单例模式
        Long aLong = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    LoadBalancer3 loadBalancer1 = LoadBalancer3.getLoadBalancer3Instance();
                    System.out.printf("thread name : %s, loadbalancer hashcode : %s\n", Thread.currentThread().getName()
                            , loadBalancer1.hashCode());
                }
            });
            thread.start();
            thread.join();
        }
        Long aLong1 = System.currentTimeMillis();
        System.out.printf("=================cost time is: %s==============\n", aLong1 - aLong);
        //简单单例模式
        Long bLong = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    LoadBalancer1 loadBalancer1 = LoadBalancer1.getLoadBalancer1Instance();
                    System.out.printf("thread name : %s, loadbalancer hashcode : %s\n", Thread.currentThread().getName()
                            , loadBalancer1.hashCode());
                }
            });
            thread.start();
            thread.join();
        }
        Long bLong1 = System.currentTimeMillis();
        System.out.printf("===============cost time is: %s=============\n", bLong1 - bLong);
        //IoDh式单例模式
        Long cLong = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    LoadBalancer4 loadBalancer1 = LoadBalancer4.getLoadBalancer4Instance();
                    System.out.printf("thread name : %s, loadbalancer hashcode : %s\n", Thread.currentThread().getName()
                            , loadBalancer1.hashCode());
                }
            });
            thread.start();
            thread.join();
        }
        Long cLong1 = System.currentTimeMillis();
        System.out.printf("===============cost time is: %s=============\n", cLong1 - cLong);
    }
}
