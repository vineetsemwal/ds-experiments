package designpatterns.pool;

public class ClientUsage {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool("mysql://localhost:3306/db", "usr", "paswd", 2);
        DBConnection connection1 = pool.acquire();
        connection1.executeQuery("SELECT * FROM users");
        pool.release(connection1);
        DBConnection connection2 = pool.acquire();
        connection2.executeQuery("update users where ...");
        pool.release(connection2);
    }
}
