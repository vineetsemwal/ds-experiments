package designpatterns.adapter;

public class ClientUsage {
    public static void main(String[] args) {
        OldClient oldClient = new OldClient(new SessionImpl());
        NewClient newClient=new NewClient(new EntityManagerImpl(new SessionImpl()));
    }
}
