package designpatterns.nullobject;

import java.util.Deque;
import java.util.LinkedList;

public class NotificationProcessor {
    private Deque<INotification>notificationsQueue=new LinkedList<>();

    public void addNotification(final INotification notification){
        notificationsQueue.add(notification);
    }

    public void processNotifications(){
        while(!notificationsQueue.isEmpty()){
            INotification notification=notificationsQueue.poll();
            notification.execute();
        }
    }

}
