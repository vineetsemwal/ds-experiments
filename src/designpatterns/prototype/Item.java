package designpatterns.prototype;

public class Item implements Cloneable{
    private long id;
    private String name;
    private double price;
    private String category;
    private GodownLocation godownLocation;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public GodownLocation getGodownLocation() {
        return godownLocation;
    }

    public void setGodownLocation(GodownLocation godownLocation) {
        this.godownLocation = godownLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
