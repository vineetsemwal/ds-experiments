package designpatterns.factory.simplefactory;

import designpatterns.factory.IComputer;

public class ClientUsage {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        IComputer computer = computerFactory.newComputer("mac");
        computer.boots();
        computer.runs();
        computer.shutsDown();
    }
}
