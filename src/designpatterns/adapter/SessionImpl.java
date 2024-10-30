package designpatterns.adapter;

public class SessionImpl implements Session {

    @Override
    public <T> T load(final Class<T> clazz,final Object id) {
        Customer customer = DatabaseStore.getInstance().get((long) id);
        return (T) customer;
    }

    @Override
    public void save(final Object object) {
        Customer customer = (Customer) object;
        DatabaseStore.getInstance().save(customer.getId(), customer);
    }

    @Override
    public void delete(final Object object) {
        Customer customer = (Customer) object;
        DatabaseStore.getInstance().delete(customer.getId());
    }
}
