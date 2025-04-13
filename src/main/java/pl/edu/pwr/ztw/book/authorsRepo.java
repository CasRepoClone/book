package pl.edu.pwr.ztw.book;


// defines our author class
public class authorsRepo {
    @SuppressWarnings("FieldMayBeFinal") // supress id 
    private String id; // ignore issue with this line, it's just a warning
    private String author;

    public authorsRepo(String id, String author) {
        this.id = id;
        this.author = author; // typo fixed 
    }
    public String getId() { return id; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
