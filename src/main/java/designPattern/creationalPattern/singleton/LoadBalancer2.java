package designPattern.creationalPattern.singleton;

/**
 * ${懒汉式单例模式}
 *
 * @author yangningkai
 * @create 2018-12-16 上午10:02
 **/
public class LoadBalancer2 {
    private static final LoadBalancer2 LOAD_BALANCER_2 = new LoadBalancer2();

    private LoadBalancer2() {
    }

    public static LoadBalancer2 getLoadBalancer2Instance() {
        return LOAD_BALANCER_2;
    }
}
