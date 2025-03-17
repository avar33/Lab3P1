public class Attachment {
    private int uniqueID;
    private String author;

    // Constructor
    public Attachment(int uniqueID, String author) {
        this.uniqueID = uniqueID;
        this.author = author;
    }
    // uniqueID getters and setters
    public int getUniqueID() {
        return uniqueID;
    }

//    public void setUniqueID(int uniqueID) {
//        this.uniqueID = uniqueID;
//    }

    // author getters and setters
    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public void preview(){
        System.out.println("Previewing attachment by author: " + author + ", ID: " + uniqueID);
    }
}

