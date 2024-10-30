package designpatterns.proxy;

public class ImageCacheProxy implements IImage{

    private transient   RealImage realImage;
    private String filePath;
    public ImageCacheProxy(final String filePath){
        this.filePath=filePath;
    }

    @Override
    public void render(){
        if(realImage==null){
            realImage=new RealImage(filePath);
        }
        realImage.render();
    }
}
