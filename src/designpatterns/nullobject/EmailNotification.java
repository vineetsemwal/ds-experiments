package designpatterns.nullobject;

public class EmailNotification implements INotification {

    private String message;
    private String emailAddress;

    public EmailNotification(final String emailAddress,
                             final String message) {
        this.message = message;
        this.emailAddress = emailAddress;
    }

    @Override
    public void execute() {
        System.out.println("Email Notification: sento to email address "+emailAddress+"---" + message);
    }
}
