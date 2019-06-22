package designPattaren.proxy.myDanamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-22 下午4:26
 **/
public class MyInvocationHandler1 implements InvocationHandler{
    private final Hello hello;

    public MyInvocationHandler1(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking sayHello");
        Object result = method.invoke(hello, args);
        return result;
    }
}
