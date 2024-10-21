package designpatterns.factory.factorymethod;

import designpatterns.factory.IComputer;
import designpatterns.factory.WindowsMachine;

public class WindowsMachineFactory implements IComputerFactory{
    @Override
    public IComputer newComputer() {
        return new WindowsMachine("10", 16, "Intel i7", "Windows");

    }
}
