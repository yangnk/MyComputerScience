package designPattern.structuralPattern.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 00:01
 **/
public class UserInvocationHandler implements InvocationHandler {
    Object target;  // 被代理的对象，实际的方法执行者

    public UserInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("======before proxy======");
        Object invoke = method.invoke(target, args);
        System.out.println("======after proxy======");
        return invoke;
    }
}