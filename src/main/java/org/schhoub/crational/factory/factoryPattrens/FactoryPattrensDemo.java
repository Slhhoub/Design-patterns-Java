package org.schhoub.crational.factory.factoryPattrens;

public class FactoryPattrensDemo {
    public static void main(String[] args){
        ShapFactory shapFactory = new ShapFactory();
        Shape rectangle = shapFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
