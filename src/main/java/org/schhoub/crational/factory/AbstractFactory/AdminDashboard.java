package org.schhoub.crational.factory.AbstractFactory;

public class AdminDashboard implements Dashboard{
    @Override
    public void showDashboard() {
        System.out.println("this is admin dashboard");
    }
}
