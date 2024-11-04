package designpatterns.observer;

public class ObservableUsage {
    public static void main(String[] args) {
        BigStockDisplayComponent component1=new BigStockDisplayComponent();
        SmallStockDisplayComponent component2=new SmallStockDisplayComponent();
        Stock stock1=new Stock("AAPL", 100.0);
        Stock stock2=new Stock("GOOGLE", 500.0);
        IStockObervable observable=new StockObservableImpl();
        observable.register(component1);
        observable.register(component2);
        observable.send(stock1);
        observable.send(stock2);
    }
}
