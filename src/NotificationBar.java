public class NotificationBar {
    static NotificationCollection notifications = new NotificationCollection();

    public void printNotifications(){
        NotificationIteratorIF iterator = notifications.createIterator();
        while(iterator.hasNext()){
            Notification n = iterator.next(); //returns current moves to next
            System.out.println(n.getContent());
        }
    }
}
