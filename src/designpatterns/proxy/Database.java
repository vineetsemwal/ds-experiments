package designpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<Long, CreatedOrder> ordersMap = new HashMap<>();

    private static final Database INSTANCE = new Database();

    public static Database getInstance() {
        return INSTANCE;
    }

    public void saveOrder(CreatedOrder order) {
        ordersMap.put(order.getId(), order);
    }

    public CreatedOrder findOrder(long id) {
        return ordersMap.get(id);
    }

}
