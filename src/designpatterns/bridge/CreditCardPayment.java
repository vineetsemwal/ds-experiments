package designpatterns.bridge;

public class CreditCardPayment implements PaymentType {

    private PaymentGateway gateway;

    public CreditCardPayment(final PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
        gateway.processPayment();
    }
}
