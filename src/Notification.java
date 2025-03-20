public class Notification {
    private final String content;
    private Attachment a;

    //constructor
    public Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        if (a != null){
            return "Notification[content='" + content + "', attachments=" + a + "]";
        }
        return content;
    }

    public void setAttachment (Attachment a) {
        this.a = a;
    }

//    @Override
//    public String toString() {
//        return "Notification[content='" + content + "', attachments=" + a + "]";
//    }
}
