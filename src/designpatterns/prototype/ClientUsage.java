package designpatterns.prototype;

public class ClientUsage {
    public static void main(String[] args) throws CloneNotSupportedException {
        Item item1=new Item();
        item1.setId(1);
        item1.setName("laptop");
        item1.setCategory("electronics");
        item1.setPrice(100000);
        item1.setBrand("lenovo");
        item1.setGodownLocation(new GodownLocation(1,"Klayani Vista", "Bangalore"));

        Item item2=(Item) item1.clone();
        item2.setId(2);
        item2.setBrand("apple");
        item2.setPrice(200000);
        System.out.println("item1="+item1.getCategory()+"-"+item1.getName()+"-brand-"+item1.getBrand()+"-"+item1.getPrice()+"-"+item1.getGodownLocation().getAddress());
        System.out.println("item2="+item2.getCategory()+"-"+item2.getName()+"-"+item2.getBrand()+"-"+item2.getPrice()+"-"+item2.getGodownLocation().getAddress());
    }
}
