import java.util.List;

public class NotificationIterator implements NotificationIteratorIF {
    private List<Notification> notifications; //hold notification created
    private int index = 0;

    //constructor with list to iterate through
    public NotificationIterator(List<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext(){ // I believe will be used to iterate to attach attachments
        return index < notifications.size();
    }

    // I believe will be used to move to next to attach attachments
    public Notification next(){  // returns current moves to next
        return hasNext() ? notifications.get(index++) : null;
    }
}
