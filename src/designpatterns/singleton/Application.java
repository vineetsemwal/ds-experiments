package designpatterns.singleton;

public class Application {
    private int portNumber;
    private String hostName;
    private int maxSizeStaticDataMB;
    private Application(){}
    private static Application instance;

    public static Application getInstance(){
        if(instance!=null){
            return instance;
        }
        return instance=new Application();
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getMaxSizeStaticDataMB() {
        return maxSizeStaticDataMB;
    }

    public void setMaxSizeStaticDataMB(int maxSizeStaticDataMB) {
        this.maxSizeStaticDataMB = maxSizeStaticDataMB;
    }

    @Override
    public String toString() {
        return "Application{" +
                "portNumber=" + portNumber +
                ", hostName='" + hostName + '\'' +
                ", maxSizeStaticDataMB=" + maxSizeStaticDataMB +
                '}';
    }
}
