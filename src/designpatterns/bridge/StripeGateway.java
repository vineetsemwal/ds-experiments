package designpatterns.bridge;

public class StripeGateway implements PaymentGateway{
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Stripe Gateway");
    }
}
