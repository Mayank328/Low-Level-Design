package FactoryPattern;

public class ShapeFactory {

    public ShapeInterface getShape(String shapeType){

        switch(shapeType.toUpperCase()){
            case "CIRCLE" -> {return new Circle();}
            case "RECTANGLE" -> { return new Rectangle();}
            case "SQUARE" -> { return new Square();}
            default -> {return null;}
        }
    }
}