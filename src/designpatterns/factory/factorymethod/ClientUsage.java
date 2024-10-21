package designpatterns.factory.factorymethod;

public class ClientUsage {
    public static void main(String[] args) {
        IComputerFactory computerFactory = new MacFactory();
        computerFactory.newComputer().boots();
        computerFactory.newComputer().runs();
        computerFactory.newComputer().shutsDown();
    }
}
