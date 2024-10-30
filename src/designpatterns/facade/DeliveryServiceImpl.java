package designpatterns.facade;

public class DeliveryServiceImpl implements IDeliveryService{
    @Override
    public void shipOrder(OrderDetails orderDetails) {
        System.out.println("Shipping order with orderID: " + orderDetails.getOrderID() + " productID: " + orderDetails.getProductID() + " units: " + orderDetails.getOrderValue() );
    }
}
