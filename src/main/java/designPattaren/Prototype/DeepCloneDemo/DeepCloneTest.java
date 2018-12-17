package designPattaren.Prototype.DeepCloneDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 上午10:23
 **/
public class DeepCloneTest {
public static void main(String[] args) throws CloneNotSupportedException {
    PersionInfo deepCloneTest = new PersionInfo("yangyang",18
            , new Address("china","zhejiang","binjiang"));
    PersionInfo deepCloneTest1 = deepCloneTest.clone();
    System.out.println("是否指向同一个对象：" + String.valueOf(deepCloneTest.hashCode() == deepCloneTest1.hashCode()));
    System.out.println("对象中对象成员变量是否是同一个：" + String.valueOf(deepCloneTest.address.hashCode() == deepCloneTest1.address.hashCode()));
    }
}
