package designpatterns.facade;

public interface InventoryService {
    boolean checkAvailable(String productID, int units);
    void reduceInventory(String productID, int units);
    double inventoryValue(String productID, int units);
    void  add(String productID, Product product);
}
