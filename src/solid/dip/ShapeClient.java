package solid.dip;

public class ShapeClient {
    public static void main(String[] args) {
      Canvas canvas1=new Canvas(new CircleShape(5));
      canvas1.drawShape();
      Canvas canvas2=new Canvas(new RectangleShape(5,10));
      canvas2.drawShape();
    }
}
