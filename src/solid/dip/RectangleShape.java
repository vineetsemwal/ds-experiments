package solid.dip;

public class RectangleShape implements IShape{
    private double width,height;

    public RectangleShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
