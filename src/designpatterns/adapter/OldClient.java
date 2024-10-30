package designpatterns.adapter;

public class OldClient {
    private final Session session;
    public OldClient(final Session session){
        this.session = session;
    }

    public void saveCustomer(Customer customer){
        session.save(customer);
    }
    public void deleteCustomer(Customer customer){
        session.delete(customer);
    }

    public Customer loadCustomer(Long id){
        return session.load(Customer.class, id);
    }

}
