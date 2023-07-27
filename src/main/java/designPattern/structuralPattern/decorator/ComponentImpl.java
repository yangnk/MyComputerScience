package designPattern.structuralPattern.decorator;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午4:11
 **/
public class ComponentImpl implements Component {
    @Override
    public void operate() {
        System.out.println("这是一个还没装修好的房子～～");
    }
}
