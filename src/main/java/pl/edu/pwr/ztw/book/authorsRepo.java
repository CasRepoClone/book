package pl.edu.pwr.ztw.book;

public class authorsRepo {
    private String id; // ignore issue with this line, it's just a warning
    private String author;

    public authorsRepo(String id, String authors) {
        this.id = id;
        this.author = author;
    }
    public String getId() { return id; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
