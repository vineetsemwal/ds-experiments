package designpatterns.factory.factorymethod;

import designpatterns.factory.IComputer;
import designpatterns.factory.Mac;

public class MacFactory implements IComputerFactory{
    @Override
    public IComputer newComputer() {
        return new Mac("14",100000,"M3","macos");
    }
}
