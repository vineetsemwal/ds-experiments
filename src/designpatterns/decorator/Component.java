package designpatterns.decorator;

public class Component implements IComponent {

    @Override
    public void renders() {
        System.out.println("Rendering component");
    }
}
