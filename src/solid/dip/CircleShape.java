package solid.dip;

public class CircleShape implements IShape {
    private double radius;
    public CircleShape(final double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
