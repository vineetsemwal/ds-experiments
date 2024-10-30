package designpatterns.facade;

import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService{
    private Map<String,Product> inventoryStore=new HashMap<>();
    @Override
    public boolean checkAvailable(final String productID, final  int desiredUnits) {
        if (!inventoryStore.containsKey(productID)){
            return false;
        }
        Product product=inventoryStore.get(productID);
        return product.getAvailableUnits()>=desiredUnits;
    }

    @Override
    public void reduceInventory(String productID, int units) {
        if (!inventoryStore.containsKey(productID)){
            return;
        }
        Product product=inventoryStore.get(productID);
        product.setAvailableUnits(product.getAvailableUnits()-units);
    }

    @Override
    public double inventoryValue(String productID, int units) {
        return inventoryStore.get(productID).getPrice()*units;
    }

    @Override
    public void add(String productID, Product product) {
        inventoryStore.put(productID,product);
    }
}
