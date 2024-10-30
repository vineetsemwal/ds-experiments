package designpatterns.decorator;

public class ComponentDecorator  extends AbstractDecorator{
    private IComponent component;

    public ComponentDecorator(final IComponent component) {
        super(component);
    }

    @Override
    public void renders() {
        System.out.println("box rendering started");
        super.renders();
        System.out.println("box rendering finished");
    }
}
