import java.util.ArrayList;
import java.util.List;

public class NotificationCollection implements NotificationCollectionIF {
    private final List<Notification> notifications = new ArrayList<>();

    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(notifications);
    }

    public Notification getItem(int index) {
        if (index < 0 || index >= notifications.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return notifications.get(index);
    }

    public void addItem(String str){
        notifications.add(new Notification(str));
    }

    public int getLength(){
        return notifications.size();
    }

    public void setAttachment(Attachment a, int index){
        notifications.get(index).setAttachment(a);
    }
}
