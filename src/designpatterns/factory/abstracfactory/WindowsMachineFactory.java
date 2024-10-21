package designpatterns.factory.abstracfactory;

import designpatterns.factory.CTypeCable;
import designpatterns.factory.ICable;
import designpatterns.factory.IComputer;
import designpatterns.factory.WindowsMachine;

public class WindowsMachineFactory implements IComputerFactory {
    @Override
    public IComputer newComputer() {
        return new WindowsMachine("10", 16, "Intel i7", "Windows");
    }

    @Override
    public ICable newCable() {
        return new CTypeCable("USB-C","1m","USB 3.1");
    }
}
