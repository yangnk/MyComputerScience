package JavaBasic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Cat rd = new Cat();
        Class c = rd.getClass();
        Class c1 = Class.forName("JavaBasic.reflect.Cat");
        Field[] fieldArr = c.getDeclaredFields();
        for (Field f : fieldArr) {
            System.out.println(f.toString());
        }
        Field f = c.getDeclaredField("name");
        f.set(rd, "miaomiao");
        System.out.println("--------"+rd.getName()+"---------");
        Method[] methodArr = c.getDeclaredMethods();
        Cat cat1 = (Cat) c.newInstance();
        for (Method m : methodArr) {
            System.out.println(m.toString());
        }
        Method m = c.getDeclaredMethod("setAge", int.class);
        m.invoke(rd, 100);
        System.out.println(rd.getAge());




        System.exit(0);
    }
}
