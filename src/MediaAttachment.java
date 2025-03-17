public class MediaAttachment extends Attachment{
    private int size_Byte;
    //constructor
    public MediaAttachment(int ID, String author, int size_Byte) {
        super(ID, author);
        this.size_Byte = size_Byte;
    }

    @Override
    public void preview() {
        System.out.println(super.toString() + "\nOpening MediaAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMediaAttachment" + size_Byte + " bytes";
    }
}
