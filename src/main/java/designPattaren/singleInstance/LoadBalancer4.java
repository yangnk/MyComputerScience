package designPattaren.singleInstance;

/**
 * ${通过内部类的方式实现单例，弥补类懒汉式不能延迟加载的问题}
 *
 * @author yangningkai
 * @create 2018-12-16 上午10:38
 **/
public class LoadBalancer4 {
    private static LoadBalancer4 loadBalancer4 = null;

    private LoadBalancer4() {}
    public static LoadBalancer4 getLoadBalancer4Instance() {
        return LoadBalancer4Instance.loadBalancer4;
    }

    private static class LoadBalancer4Instance {
        public static LoadBalancer4 loadBalancer4 = new LoadBalancer4();
    }
}
