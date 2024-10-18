package designpatterns.singleton;

public class ClientUsage {
    public static void main(String[] args) {
        Application application1=Application.getInstance();
        application1.setHostName("application.com");
        application1.setPortNumber(80);
        application1.setMaxSizeStaticDataMB(100);

        Application application2=Application.getInstance();
        System.out.println(application2);
    }
}
