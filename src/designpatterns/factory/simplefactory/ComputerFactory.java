package designpatterns.factory.simplefactory;

import designpatterns.factory.IComputer;
import designpatterns.factory.Mac;
import designpatterns.factory.UnsupportedComputerTypeException;
import designpatterns.factory.WindowsMachine;

public class ComputerFactory {

    public IComputer newComputer(final String type){
        if(type.equalsIgnoreCase("pc")){
            return new WindowsMachine("11",100000,"intel i15","windows");
        }
        if(type.equalsIgnoreCase("mac")){
            return new Mac("14",100000,"M3","macos");
        }
        throw new UnsupportedComputerTypeException("Invalid computer type");
    }

}
