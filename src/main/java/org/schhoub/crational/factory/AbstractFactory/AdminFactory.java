package org.schhoub.crational.factory.AbstractFactory;

public class AdminFactory implements UserAbstractFactory{
    @Override
    public User createUser() {
        return new Admin();
    }

    @Override
    public Dashboard createDashboard() {
        return new AdminDashboard();
    }
}
