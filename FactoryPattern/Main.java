package FactoryPattern;

public class Main{

    public static void main(String[] args) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        ShapeInterface Obj = shapeFactoryObj.getShape("CIRCLE");
        Obj.draw();

    }
}