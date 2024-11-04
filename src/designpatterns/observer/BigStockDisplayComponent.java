package designpatterns.observer;

/**
 * Component observer that displays the stock details in a big display
 * Gets the update , Uses the update, Doesn't hang/wait for the update
 */
public class BigStockDisplayComponent implements IComponent,IStockObserver{
    private Stock stock;

    @Override
    public void render(){
        System.out.println("BIG Display of stock details"+stock.getSymbol()+" -"+stock.getPrice());
    }

    public void update(final Stock stock){
        this.stock=stock;
        render();
    }

}
