public class Notification {
    private final String content;
    private Attachment a;

    //constructor
    public Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        if (a != null){
            return content + "[" + a + "]";
        }
        return content + "[attachments= none]";
    }

    public void setAttachment (Attachment a) {
        this.a = a;
    }
}
