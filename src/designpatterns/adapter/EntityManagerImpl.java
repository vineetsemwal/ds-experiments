package designpatterns.adapter;

public class EntityManagerImpl implements EntityManager {

    private final Session session;

    public EntityManagerImpl(final Session session) {
        this.session = session;
    }

    @Override
    public <T> T find(Class<T> clazz, Object id) {
        return session.load(clazz, id);
    }

    @Override
    public void persist(Object object) {
        session.save(object);
    }

    @Override
    public void remove(Object object) {
        session.delete(object);
    }
}
