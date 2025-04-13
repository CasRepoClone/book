package pl.edu.pwr.ztw.book;

// all methods need to be added into our service file here
public interface IBooksService {
    public abstract Book getBook(int id); 

    public abstract Book deleteBook(int id); // delete book by id

    public abstract Book createBook(int id, String title, String author, int pages); 
}