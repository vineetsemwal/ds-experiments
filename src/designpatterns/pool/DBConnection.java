package designpatterns.pool;

public class DBConnection {
    private String url;
    private String username;
    private String password;

    public DBConnection(final String url,final String username,final String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    public void close() {
        System.out.println("Closing connection");
    }


}
