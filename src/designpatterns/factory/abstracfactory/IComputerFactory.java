package designpatterns.factory.abstracfactory;

import designpatterns.factory.ICable;
import designpatterns.factory.IComputer;

public interface IComputerFactory {
    IComputer newComputer();
    ICable newCable();
}
