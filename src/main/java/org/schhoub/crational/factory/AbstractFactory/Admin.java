package org.schhoub.crational.factory.AbstractFactory;

public class Admin implements User{
    @Override
    public void showRole() {
        System.out.println("this is admin role");
    }
}
