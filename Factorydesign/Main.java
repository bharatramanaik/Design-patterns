package Factorydesign;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeobj = shapeFactory.getShape("circle");
        shapeobj.draw();

    }
}
