public class FileAttachement extends Attachment{
    private int size_Byte;
    //constructor
    public FileAttachement(int ID, String author, int size_Byte) {
        super(ID, author);
        this.size_Byte = size_Byte;
    }
    @Override
    public void preview() {
        System.out.println(super.toString() + "\nOpening FileAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return super.toString() + "\nFileAttachment" + size_Byte + " bytes";
    }
}
