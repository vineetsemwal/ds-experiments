package designpatterns.proxy;

public class RealImage implements IImage {
    private String filePath;

    public RealImage(final String filePath) {
        this.filePath = filePath;
        loadResource();
    }


    public byte[] loadResource() {
        System.out.println("Loading resource from filepath=" + filePath);
        return new byte[0];
    }

    @Override
    public void render() {
        System.out.println("Displaying " + filePath);
    }
}
