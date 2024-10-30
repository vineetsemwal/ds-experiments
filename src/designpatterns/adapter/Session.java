package designpatterns.adapter;

public interface Session {
    <T> T load(Class<T> clazz, Object id);

    void save(Object object);

    void delete(Object object);
}
