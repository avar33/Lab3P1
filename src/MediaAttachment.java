public class MediaAttachment extends Attachment{
    private int size_Byte;
    //constructor
    public MediaAttachment(int ID, String author, int size_Byte) {
        super(ID, author);
        this.size_Byte = size_Byte;
    }

    @Override
    public void preview() {
        System.out.println("Opening MediaAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return "MediaAttachment " +super.getUniqueID()+ " by " + super.getAuthor() + "\nsize: " + size_Byte + " bytes";
    }
}
