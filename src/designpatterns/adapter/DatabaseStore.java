package designpatterns.adapter;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStore {
    private static final DatabaseStore instance = new DatabaseStore();

    private DatabaseStore() {

    }

    public static DatabaseStore getInstance() {
        return instance;
    }

    private Map<Long, Customer> map = new HashMap<>();

    public void save(final Long key, final Customer value) {
        map.put(key, value);
    }

    public Customer get(final Long key) {
        return map.get(key);
    }

    public void delete(final Long key) {
        map.remove(key);
    }
}
