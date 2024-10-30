package designpatterns.adapter;

public interface EntityManager {

    <T> T find(Class<T> clazz, Object id);

    void persist(Object object);

    void remove(Object object);
}
