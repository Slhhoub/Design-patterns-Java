package org.schhoub.crational.factory.factoryPattrens;

public class ShapFactory {
    public Shape getShape(String shape){
        if(shape==null) return null;
        if(shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if(shape.equalsIgnoreCase("CIRCLE"))
            return new Circal();
        if(shape.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
