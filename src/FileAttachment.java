public class FileAttachment extends Attachment{
    private int size_Byte;
    //constructor
    public FileAttachment(int ID, String author, int size_Byte) {
        super(ID, author);
        this.size_Byte = size_Byte;
    }
    @Override
    public void preview() {
        System.out.println("Opening FileAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return "FileAttachment " +super.getUniqueID()+ " by " + super.getAuthor() + "\n size: " + size_Byte + " bytes";
    }
}
