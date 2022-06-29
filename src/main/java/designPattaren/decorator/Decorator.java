package designPattaren.decorator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午4:13
 **/
public class Decorator implements Component{
    Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operate() {
        component.operate();
    }
}
