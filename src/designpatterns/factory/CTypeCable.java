package designpatterns.factory;

public class CTypeCable implements ICable {
    private String type;
    private String length;
    private String connectorType;
    public CTypeCable(String type, String length, String connectorType) {
        this.type = type;
        this.length = length;
        this.connectorType = connectorType;
    }

    @Override
    public void transferData() {
        System.out.println("CTypeCable transferring data");
    }
}
