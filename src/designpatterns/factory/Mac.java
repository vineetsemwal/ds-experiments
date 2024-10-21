package designpatterns.factory;

public class Mac implements IComputer {
    private String version;
    private long ramSizeMB;
    private String cpu;
    private String os;
    public Mac(String version, long ramSize, String cpu,String os) {
        this.version = version;
        this.ramSizeMB = ramSize;
        this.cpu = cpu;
        this.os = os;
    }

    @Override
    public void boots() {
        System.out.println(cpu+" -"+ version+"-" + "Booting Mac"+" with "+ ramSizeMB +"GB RAM and "+os);
    }

    @Override
    public void shutsDown() {
        System.out.println("Shutting down Mac");
    }

    @Override
    public void runs() {
        System.out.println("Running Mac");
    }
}
