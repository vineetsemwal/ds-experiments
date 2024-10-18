package solid.liskov;

public class ShapeClient {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);

        System.out.println(rectangle.getArea());


    }
}
