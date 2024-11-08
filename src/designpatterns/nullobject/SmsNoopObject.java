package designpatterns.nullobject;

public class SmsNoopObject implements INotification{
    private String customerName;
    public SmsNoopObject(String customerName){
        this.customerName=customerName;
    }

    @Override
    public void execute() {
        System.out.println("no sms sent for customer "+customerName);
    }
}
