package designpatterns.adapter;

public class NewClient {
    private final EntityManager entityManager;

    public NewClient(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    public void removeCustomer(Customer customer) {
        entityManager.remove(customer);
    }

    public Customer findCustomer(Long id) {
        return entityManager.find(Customer.class, id);
    }
}
