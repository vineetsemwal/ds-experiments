package designpatterns.facade;

public class PaymentServiceImpl implements IPaymentService {
    @Override
    public boolean processPayment(String paymentType, String paymentDetails, double amount) {
        System.out.println("Payment processed successfully");
        return true;
    }
}
