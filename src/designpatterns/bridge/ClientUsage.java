package designpatterns.bridge;

public class ClientUsage {
    public static void main(String[] args) {
        PaymentType creditCardPaymentUsingStripe = new CreditCardPayment(new StripeGateway());
        creditCardPaymentUsingStripe.processPayment();

        PaymentType creditCardPaymentUsingPaypal = new CreditCardPayment(new PaypalGateway());
        creditCardPaymentUsingPaypal.processPayment();

        PaymentType creditCardPaymentUsingUPI = new CreditCardPayment(new UPIGateway());
        creditCardPaymentUsingUPI.processPayment();


        PaymentType debitCardPaymentUsingStripe=new DebitCardPayment(new StripeGateway());
        debitCardPaymentUsingStripe.processPayment();

        PaymentType debitCardPaymentUsingPaypal=new DebitCardPayment(new PaypalGateway());
        debitCardPaymentUsingPaypal.processPayment();

        PaymentType debitCardPaymentUsingUPI=new DebitCardPayment(new UPIGateway());
        debitCardPaymentUsingUPI.processPayment();


    }
}
