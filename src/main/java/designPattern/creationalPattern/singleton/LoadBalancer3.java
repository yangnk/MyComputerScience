package designPattern.creationalPattern.singleton;

/**
 * ${饿汉式单例模式,实现双重校验}
 *
 * @author yangningkai
 * @create 2018-12-16 上午10:07
 **/
public class LoadBalancer3 {
    private static volatile LoadBalancer3 loadBalancer3 = null;

    private LoadBalancer3() {
    }

    public static LoadBalancer3 getLoadBalancer3Instance() {
        if (loadBalancer3 == null) {
            synchronized (LoadBalancer3.class) {
                if (loadBalancer3 == null) {
                    loadBalancer3 = new LoadBalancer3();
                }
            }
        }
        return loadBalancer3;
    }
}
