import javax.management.NotificationListener;
import java.util.ArrayList;
import java.util.List;

public class NotificationCollection implements NotificationCollectionIF {
    private final List<Notification> notifications = new ArrayList<>();

    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(notifications);
    }

    public Notification getItem(int index) {
        return notifications.get(index);
    }

    public void addItem(String str){
        notifications.add(new Notification(str));
    }

    public int getLength(){
        return notifications.size();
    }

    //TODO: FINISH
    public void setAttachment(Attachment a, int index){}
}
