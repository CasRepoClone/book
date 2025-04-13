package pl.edu.pwr.ztw.book;

// interface mapping to our service class
// all methods need to be added into our service file here
public interface IBooksService {
    public abstract Book getBook(int id);  // get book by id 

    public abstract Book deleteBook(int id); // delete book by id

    public abstract Book createBook(int id, String title, String author, int pages);  // create book by id

    public abstract Book updateBook(int id, String title, String author, int pages); // update book by id

    public abstract authorsRepo getAuthor(String id); // get author by id
}