public class Demo {
    public static void main(String[] args) {
        // PHASE 1
        System.out.println("PHASE 1:");
        NotificationCollection notifications = new NotificationCollection();
        // adds 10 new notifications into a collection
        for (int i = 0; i < 10; i++) {
            notifications.addItem("notification" + (i+1)); //i+1 so notifs will be numbered 1-10
        }

        //display notifications just added
        for (int i = 0; i < 10; i++) {
            System.out.println("Item " + (i+1) + ": " + notifications.getItem(i).getContent());
        }
        Attachment att1 = new Attachment(000, "Bob");
        FileAttachment fAtt1 = new FileAttachment(001, "Rich", 16);
        MediaAttachment mAtt1 = new MediaAttachment(002, "Andy", 24);

//        System.out.println("Testing Attachment: " + att1.toString());
//        att1.preview();
//        System.out.println("Testing FileAttachment: " + fAtt1.toString());
//        fAtt1.preview();
//        System.out.println("Testing MediaAttachment: " + mAtt1.toString());
//        mAtt1.preview();

    }
}