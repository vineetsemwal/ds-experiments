package solid.liskov;

import java.awt.*;

public class Square implements IShape {

    private int side;
    public Square(final int side) {
        this.side=side;
    }
    public Square() {
        this.side=0;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
