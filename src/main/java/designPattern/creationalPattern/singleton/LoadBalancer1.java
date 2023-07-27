package designPattern.creationalPattern.singleton;

/**
 * ${最简单单例模式}
 *
 * @author yangningkai
 * @create 2018-12-16 上午9:49
 **/
public class LoadBalancer1 {
    private static LoadBalancer1 loadBalancer1 = null;

    private LoadBalancer1() {
    }

    public static LoadBalancer1 getLoadBalancer1Instance() {
        if (loadBalancer1 == null) {
            loadBalancer1 = new LoadBalancer1();
        }
        return loadBalancer1;
    }
}
