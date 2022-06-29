package designPattaren.Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache shapeCache1 = new ShapeCache();
        shapeCache1.loadCache();
        Shape cloned1 = shapeCache1.getShape(1);
        System.out.println(cloned1.getName());
        Shape cloned2 = shapeCache1.getShape(2);
        System.out.println(cloned2.getName());
        Shape cloned3 = shapeCache1.getShape(3);
        System.out.println(cloned3.getName());
    }
}
