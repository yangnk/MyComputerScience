package designPattaren.builder.Prototype;

import java.util.HashMap;

public class ShapeCache {
    private HashMap<Integer, Shape> hashmap1 = new HashMap<Integer, Shape>();

    public Shape getShape(int shapeId) throws CloneNotSupportedException {
        Shape shape1 = hashmap1.get(shapeId);
        return (Shape) shape1.clone();
    }

    public void loadCache(){
        //circle
        Circle circle1 = new Circle();
        circle1.setId(1);
        circle1.setName("circle");
        hashmap1.put(circle1.getId(), circle1);
        //rectangle
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setId(2);
        rectangle1.setName("rectangle");
        hashmap1.put(rectangle1.getId(), rectangle1);
        //square
        Square square1 = new Square();
        square1.setId(3);
        square1.setName("square");
        hashmap1.put(square1.getId(), square1);
    }
}
