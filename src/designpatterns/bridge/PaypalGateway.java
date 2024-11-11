package designpatterns.bridge;

public class PaypalGateway implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Paypal Gateway");
    }
}
