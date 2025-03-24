package org.schhoub.crational.factory.AbstractFactory;

public class ClientFactory implements UserAbstractFactory{
    @Override
    public User createUser() {
        return new Client();
    }

    @Override
    public Dashboard createDashboard() {
        return new ClientDashboard();
    }
}
