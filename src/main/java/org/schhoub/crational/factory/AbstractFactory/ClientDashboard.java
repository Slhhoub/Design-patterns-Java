package org.schhoub.crational.factory.AbstractFactory;

public class ClientDashboard implements Dashboard{
    @Override
    public void showDashboard() {
        System.out.println("this is dashboard client");
    }
}
