package designpatterns.bridge;

public class UPIGateway implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using UPI Gateway");
    }
}
