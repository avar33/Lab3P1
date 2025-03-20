public class Attachment {
    private final int uniqueID;
    private final String author;

    // Constructor
    public Attachment(int uniqueID, String author) {
        this.uniqueID = uniqueID;
        this.author = author;
    }
    // uniqueID getter
    public int getUniqueID() {
        return uniqueID;
    }

    // author getter
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Attachment(uniqueID= '" + uniqueID + "', author= '" + author + "')";
    }

    public void preview(){
        System.out.println("Previewing attachment by author: " + author + ", ID: " + uniqueID);
    }
}

