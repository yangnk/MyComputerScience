package designPattern.structuralPattern.decorator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午4:20
 **/
public class DecoratorMain {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ComponentImpl());
        Component component1 = new ConcreteDecoratorB(new ComponentImpl());
        component.operate();
        System.out.println("==========萌萌分割线^_^==========");
        component1.operate();
    }
}
