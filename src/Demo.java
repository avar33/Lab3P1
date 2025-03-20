public class Demo {
    public static void main(String[] args) {
        NotificationBar notificationBar = new NotificationBar();
        // PHASE 1
        System.out.println("PHASE 1:");
        // adds 10 new notifications into the notification collection declared in notification bar
        for (int i = 0; i < 10; i++) {
            NotificationBar.notifications.addItem("Notification " + (i+1)); //i+1 so notifs will be numbered 1-10
        }

        //display notifications just added
        notificationBar.printNotifications();

        //attachments to be added
        FileAttachment fAtt1 = new FileAttachment(100, "Rich", 16);
        MediaAttachment mAtt1 = new MediaAttachment(150, "Amy", 24);

        // PHASE 2
        System.out.println("PHASE 2:");
        // iterates through the existing 10 notifications
        for (int i = 0; i < 10; i++) {
            if (i < 3){ NotificationBar.notifications.setAttachment(mAtt1, i);} // if notifications 0-2 (numbered 1-3) attach media
            else if (i == 4 || i == 8) {NotificationBar.notifications.setAttachment(fAtt1, i);} // if notifications numbered 5 or 9 attach file
        }

        //display all notifications
        notificationBar.printNotifications();
    }
}