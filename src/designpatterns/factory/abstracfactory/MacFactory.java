package designpatterns.factory.abstracfactory;

import designpatterns.factory.ICable;
import designpatterns.factory.IComputer;
import designpatterns.factory.LightningCable;
import designpatterns.factory.Mac;

public class MacFactory implements IComputerFactory {
    @Override
    public IComputer newComputer() {
        return new Mac("14",100000,"M3","macos");
    }

    @Override
    public ICable newCable() {
        return new LightningCable("Lightning","1.5m","black");
    }
}
