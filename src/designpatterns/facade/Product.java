package designpatterns.facade;

public class Product {
    private String id;
    private String name;
    private int availableUnits;
    private double price;

    public Product(String id, String name, int availableUnits, double price) {
        this.id = id;
        this.name = name;
        this.availableUnits = availableUnits;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
