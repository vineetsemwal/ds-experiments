package designpatterns.factory;

public class LightningCable implements ICable{
    private String type;
    private String length;
    private String color;
    public LightningCable(String type, String length, String color) {
        this.type = type;
        this.length = length;
        this.color = color;
    }

    @Override
    public void transferData() {
        System.out.println("Lightning cable transfers data");
    }
}
