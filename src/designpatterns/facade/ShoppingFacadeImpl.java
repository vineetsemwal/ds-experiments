package designpatterns.facade;

import java.util.UUID;

public class ShoppingFacadeImpl implements IShoppingFacade {
    private final IPaymentService paymentService;
    private final INotificationService notificationService;
    private final IDeliveryService deliveryService;
    private final InventoryService inventoryService;

    public ShoppingFacadeImpl(final IPaymentService paymentService, final INotificationService notificationService,
                              final IDeliveryService deliveryService, final InventoryService inventoryService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.deliveryService = deliveryService;
        this.inventoryService = inventoryService;
    }



    @Override
    public void createOrder(final OrderRequest orderRequest) {
        if (!inventoryService.checkAvailable(orderRequest.getProductID(), orderRequest.getUnits())) {
            notificationService.sendNotification(orderRequest.getCustomerDetails().getPhoneNumber(), "Sorry, your order could not be placed");
            return;
        }
        OrderDetails orderDetails=new OrderDetails();
        String orderID= UUID.randomUUID().toString();
        orderDetails.setOrderID(orderID);
        double orderValue= inventoryService.inventoryValue(orderRequest.getProductID(), orderRequest.getUnits());
        orderDetails.setOrderValue(orderValue);
        orderDetails.setProductID(orderRequest.getProductID());
        orderDetails.setUnits(orderRequest.getUnits());

        paymentService.processPayment(orderRequest.getCustomerDetails().getPaymentType(),
                orderRequest.getCustomerDetails().getPaymentDetails(), orderValue);
        inventoryService.reduceInventory(orderRequest.getProductID(), orderRequest.getUnits());
        notificationService.sendNotification(orderRequest.getCustomerDetails().getPhoneNumber(), "Your order has been placed successfully "+orderRequest.getProductID()+ " units= "+orderRequest.getUnits());

        deliveryService.shipOrder(orderDetails);
    }


}
