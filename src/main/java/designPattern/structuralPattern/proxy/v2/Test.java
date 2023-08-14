package designPattern.structuralPattern.proxy.v2;

import java.lang.reflect.Proxy;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 00:03
 **/
public class Test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ClassLoader classLoader = userService.getClass().getClassLoader();
        Class<?>[] interfaces = userService.getClass().getInterfaces();
        UserInvocationHandler userInvocationHandler = new UserInvocationHandler(userService);
        UserService userService1 = (UserService) Proxy.newProxyInstance(classLoader, interfaces, userInvocationHandler);
        userService1.selectUser();
        userService1.insertUser("tony");
    }
}