package designpatterns.facade;

public class OrderRequest { // OrderDetails
    private CustomerDetails customerDetails;
    private String productID;
    private int units;
    private String deliveryAddress;

    public OrderRequest(final CustomerDetails customerDetails,final String productID,final int units) {
        this.customerDetails = customerDetails;
        this.productID = productID;
        this.units = units;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public String getProductID() {
        return productID;
    }

    public int getUnits() {
        return units;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
