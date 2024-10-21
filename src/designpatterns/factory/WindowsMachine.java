package designpatterns.factory;

public class WindowsMachine implements IComputer {
    private String version;
    private long ramSizeMB;
    private String cpu;
    private String os;
    public WindowsMachine(String version, long ramSizeMB, String cpu, String os) {
        this.version = version;
        this.ramSizeMB = ramSizeMB;
        this.cpu = cpu;
        this.os = os;
    }

    @Override
    public void boots() {
        System.out.println(cpu+"-"+os+"-"+ramSizeMB +"-window machine boots");
    }

    @Override
    public void shutsDown() {
        System.out.println("window machine shuts down");
    }

    @Override
    public void runs() {
        System.out.println("window machine runs");
    }
}
