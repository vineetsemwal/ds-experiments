package designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * provides the update to subscribers/observers
 */
public class StockObservableImpl implements IStockObervable{
    private Set<IStockObserver>observers=new HashSet<>();
    @Override
    public void register(final IStockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(final IStockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void send(final Stock stock) {
     for (IStockObserver observer:observers){
         observer.update(stock);
     }
    }
}
