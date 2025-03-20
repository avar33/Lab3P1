public class FileAttachment extends Attachment{
    private int size_Byte;
    //constructor
    public FileAttachment(int ID, String author, int size_Byte) {
        super(ID, author);
        if (size_Byte < 0) {
            throw new IllegalArgumentException("File size cannot be negative.");
        }
        this.size_Byte = size_Byte;
    }
    @Override
    public void preview() {
        System.out.println("Previewing FileAttachment(Size: " + size_Byte + " bytes)");
    }

    @Override
    public String toString() {
        return "FileAttachment[ID= '" +super.getUniqueID()+ "', author= '" + super.getAuthor() + "', size= '" + size_Byte + " bytes'";
    }
}
