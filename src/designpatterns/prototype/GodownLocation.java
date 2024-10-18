package designpatterns.prototype;

public class GodownLocation implements Cloneable {
    private long id;
    private String address;
    private String city;


    public GodownLocation() {
    }

    public GodownLocation(long id,String address, String city) {
        this.address = address;
        this.id=id;
        this.city=city;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    // Overriding clone() method to create a deep copy of an object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
