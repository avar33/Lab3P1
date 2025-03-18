public class Demo {
    public static void main(String[] args) {
        Attachment att1 = new Attachment(000, "Bob");
        FileAttachment fAtt1 = new FileAttachment(001, "Rich", 16);
        MediaAttachment mAtt1 = new MediaAttachment(002, "Andy", 24);

        System.out.println("Testing Attachment: ");
        att1.preview();
        System.out.println("Testing FileAttachment: " + fAtt1.toString());
        fAtt1.preview();
        System.out.println("Testing MediaAttachment: " + mAtt1.toString());
        mAtt1.preview();

    }
}