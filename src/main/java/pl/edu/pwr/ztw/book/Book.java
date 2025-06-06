package pl.edu.pwr.ztw.book;

public class Book {
    @SuppressWarnings("FieldMayBeFinal") // supress id 
    private int id; // ignore issue with this line, it's just a warning
    private String title;
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }
}