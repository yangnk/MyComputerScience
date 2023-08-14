package designPattern.structuralPattern.decorator.v2;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 20:09
 **/
public abstract class ShapeDecotator implements Shape {
    Shape shape;

    public ShapeDecotator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}