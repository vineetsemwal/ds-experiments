package designpatterns.observer;

public interface IStockObervable {
    void register(IStockObserver observer);
    void unregister(IStockObserver observer);
    void send(Stock stock);
}
