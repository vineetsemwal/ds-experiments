package designpatterns.pool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {
    private Queue<DBConnection> connections=new LinkedList<>();

    private int maxConnections=10;
    public void setMaxConnections(int maxConnections){
        this.maxConnections=maxConnections;
    }

    private String url;
    private String username;
    private String password;


    public ConnectionPool(final String url,final String username,final String password,int maxConnections){
        this.url=url;
        this.username=username;
        this.password=password;
        for(int i=0;i<maxConnections;i++){
            connections.add(new DBConnection(url,username,password));
        }
    }


    public DBConnection acquire(){
        if(connections.isEmpty()){
            connections.add(newConnection());
        }
        DBConnection connection=connections.poll();
        return connection;
    }

    public void release(DBConnection connection){
        if(connections.size()==maxConnections) return;
        connections.add(connection);

    }

    public DBConnection newConnection(){
       return new DBConnection(url,username,password);
    }

}
