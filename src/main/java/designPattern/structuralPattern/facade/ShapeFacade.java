package designPattern.structuralPattern.facade;

/**
 * @author yangnk
 * @desc
 * @date 2023/08/14 21:06
 **/
public class ShapeFacade {

    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();

    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}