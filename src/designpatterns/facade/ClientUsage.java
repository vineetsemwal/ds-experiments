package designpatterns.facade;

public class ClientUsage {
    public static void main(String[] args) {
        InventoryService inventoryService=new InventoryServiceImpl();
        String productID1="37787387d-o1";
        Product product1=new Product(productID1, "motorola charger", 10,200);
        inventoryService.add(productID1, product1);
        String productID2="9348773-2";
        Product product2=new Product(productID2, "iphone charger", 20,5000);
        inventoryService.add(productID2,product2);
        IShoppingFacade shoppingFacade = new ShoppingFacadeImpl(new PaymentServiceImpl(),new NotificationServiceImpl(),
                new DeliveryServiceImpl(), inventoryService);
        CustomerDetails customerDetails=new CustomerDetails();
        customerDetails.setId("34773478");
        customerDetails.setName("John Doe");
        customerDetails.setPhoneNumber("1234567890");
        customerDetails.setPaymentType("CREDIT");

        OrderRequest orderRequest = new OrderRequest(customerDetails,productID1, 2);
        shoppingFacade.createOrder(orderRequest);
    }
}
