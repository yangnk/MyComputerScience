package designPattern.structuralPattern.decorator.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 20:12
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(shape);
        redShapeDecorator.draw();
    }
}