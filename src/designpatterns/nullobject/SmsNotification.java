package designpatterns.nullobject;

public class SmsNotification implements INotification {

    private String message;
    private String phoneNumber;
    public SmsNotification(String phoneNumber,String message) {
        this.message = message;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void execute() {
        System.out.println("SMS Notification: sent to "+phoneNumber+" -" + message);
    }
}
