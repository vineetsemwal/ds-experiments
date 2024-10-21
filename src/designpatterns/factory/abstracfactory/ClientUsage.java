package designpatterns.factory.abstracfactory;

import designpatterns.factory.ICable;
import designpatterns.factory.IComputer;

public class ClientUsage {
    public static void main(String[] args) {
        IComputerFactory computerFactory = new MacFactory();
        IComputer computer = computerFactory.newComputer();
        ICable cable=computerFactory.newCable();
        computer.boots();
        computer.runs();
        cable.transferData();
    }
}
