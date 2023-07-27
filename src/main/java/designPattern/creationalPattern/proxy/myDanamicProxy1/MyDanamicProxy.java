package designPattern.creationalPattern.proxy.myDanamicProxy1;


import java.lang.reflect.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-22 下午4:20
 **/
public class MyDanamicProxy {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        MyInvocationHandler1 handler = new MyInvocationHandler1(hello);
        Hello hello1 = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        hello1.sayHellp();
    }
}
