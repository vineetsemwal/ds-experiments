package designpatterns.nullobject;

import java.util.ArrayList;
import java.util.List;

public class NullObjectPatternUsage {
    public static void main(String[] args) {
        List<Customer> customersDatabase = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setName("John Doe");
        customer1.setEmailAddress("john@gmail.com");
        customer1.setPhoneNumber("1234567890");

        Customer customer2 = new Customer();
        customer2.setName("ganya");
        customer2.setPhoneNumber("012345349280");

        Customer customer3 = new Customer();
        customer3.setName("venkat");
        customer3.setPhoneNumber("1340567890");

        Customer customer4 = new Customer();
        customer4.setName("sai");
        customer4.setEmailAddress("sai@gmail.com");

        customersDatabase.add(customer1);
        customersDatabase.add(customer2);
        customersDatabase.add(customer3);
        customersDatabase.add(customer4);

        String msg = "20% Discount available from 1 dec on Clothes";

        NotificationProcessor notificationProcessor = new NotificationProcessor();
        for (Customer customer : customersDatabase) {

            INotification emailNotification;
            if (customer.getEmailAddress() == null || customer.getEmailAddress().isBlank()) {
                emailNotification = new EmailNoopObject(customer.getName());
            } else {
                emailNotification = new EmailNotification(customer.getEmailAddress(), msg);
            }
            notificationProcessor.addNotification(emailNotification);

            INotification smsNotification;
            if (customer.getPhoneNumber() == null || customer.getPhoneNumber().isBlank()) {
                smsNotification = new SmsNoopObject(customer.getName());
            } else {
                smsNotification = new SmsNotification(customer.getPhoneNumber(), msg);
            }
            notificationProcessor.addNotification(smsNotification);
        }

        notificationProcessor.processNotifications();

    }
}
