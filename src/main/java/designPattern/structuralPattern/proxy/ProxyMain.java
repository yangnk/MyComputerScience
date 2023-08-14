package designPattern.structuralPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午6:03
 **/
public class ProxyMain {
    public static void main(String[] args) {
        Search search = new SearchPoxy();
        search.search("yangyang");
        System.out.println("=========萌萌分割线^_^===========");
        search.search("wangwang");
    }
}
