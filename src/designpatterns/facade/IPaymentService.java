package designpatterns.facade;

public interface IPaymentService {
    boolean processPayment(String paymentType, String paymentDetails, double amount);
}
