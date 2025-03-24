package org.schhoub.crational.factory.AbstractFactory;

public class Client implements User{
    @Override
    public void showRole() {
        System.out.println("this is role client");
    }
}
