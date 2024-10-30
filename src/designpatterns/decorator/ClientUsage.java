package designpatterns.decorator;

public class ClientUsage {
    public static void main(String[] args) {

        IComponent component=new ComponentDecorator(new Component());
        component.renders();


    }
}
