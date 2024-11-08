package designpatterns.nullobject;

public class EmailNoopObject implements INotification {

    private String customerName;
    public EmailNoopObject(String customerName) {
    this.customerName=customerName;
    }

    @Override
    public void execute() {
        System.out.println("no mail sent for customer "+customerName);
    }
}
