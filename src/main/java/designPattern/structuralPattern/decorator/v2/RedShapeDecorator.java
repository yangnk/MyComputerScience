package designPattern.structuralPattern.decorator.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 20:11
 **/
public class RedShapeDecorator extends ShapeDecotator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("this is RedShapeDecorator");
    }
}