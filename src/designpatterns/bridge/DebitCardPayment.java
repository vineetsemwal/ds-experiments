package designpatterns.bridge;

public class DebitCardPayment implements PaymentType{

    private PaymentGateway gateway;
    public DebitCardPayment(final PaymentGateway paymentGateway){
        this.gateway=paymentGateway;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment");
        gateway.processPayment();
    }
}
