public class MediaAttachment extends Attachment{
    private int size_Byte;
    //constructor
    public MediaAttachment(int ID, String author, int size_Byte) {
        super(ID, author);
        if (size_Byte < 0) {
            throw new IllegalArgumentException("Media size cannot be negative.");
        }
        this.size_Byte = size_Byte;
    }

    @Override
    public void preview() {
        System.out.println("Previewing MediaAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return "MediaAttachment[ID= '" +super.getUniqueID()+ "', author= '" + super.getAuthor() + "', size= '" + size_Byte + " bytes'";
    }
}
