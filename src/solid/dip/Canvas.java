package solid.dip;



public class Canvas {
    private IShape shape;
    public Canvas(final IShape shape){
        this.shape =shape;
    }

    public void drawShape(){
        System.out.println("drawing shape with area="+ shape.area());
    }

}
