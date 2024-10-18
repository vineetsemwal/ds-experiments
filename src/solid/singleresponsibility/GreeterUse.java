package solid.singleresponsibility;

public class GreeterUse {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet(new English()));
        System.out.println(greeter.greet(new Tamil()));
    }
}
