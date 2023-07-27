package designPattern.structuralPattern.decorator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午4:16
 **/
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        addPreOperate();
        super.operate();
        addPostOperate();
    }

    private void addPreOperate() {
        System.out.println("装修前准备～～");
    }

    private void addPostOperate() {
        System.out.println("这是极简风装修好了房子～～");
    }
}
