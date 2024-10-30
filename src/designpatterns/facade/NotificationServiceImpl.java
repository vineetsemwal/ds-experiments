package designpatterns.facade;

public class NotificationServiceImpl implements INotificationService{

   public void sendNotification(String phoneNumber, String message) {
        System.out.println("Notification sent to " + phoneNumber + " with message: " + message);
    }
}
