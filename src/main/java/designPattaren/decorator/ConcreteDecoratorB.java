package designPattaren.decorator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午4:16
 **/
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
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
        System.out.println("这是奢侈风装修好了房子～～");
    }
}
