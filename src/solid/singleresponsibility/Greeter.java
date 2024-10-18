package solid.singleresponsibility;

public class Greeter {

    public String greet(Language language) {
       return language.greet();
    }

}
