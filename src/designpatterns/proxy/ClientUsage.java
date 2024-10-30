package designpatterns.proxy;

public class ClientUsage {
    public static void main(String[] args) {
        IImage image=new ImageCacheProxy("file://dir/file.jpg");
        image.render();
        image.render();
        image.render();
    }
}
