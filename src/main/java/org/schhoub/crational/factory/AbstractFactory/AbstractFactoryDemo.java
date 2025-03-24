package org.schhoub.crational.factory.AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        UserAbstractFactory factory = new ClientFactory();
        User user = factory.createUser();
        user.showRole();
        Dashboard dashboard = factory.createDashboard();
        dashboard.showDashboard();

    }
}
