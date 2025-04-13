package pl.edu.pwr.ztw.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService implements IBooksService {

    private static final List<Book> booksRepo = new ArrayList<>();

    static {
        booksRepo.add(new Book(1, "Potop", "Henryk Sienkiewicz", 936));
        booksRepo.add(new Book(2, "Wesele", "Stanisław Reymont", 150));
        booksRepo.add(new Book(3, "Dziady", "Adam Mickiewicz", 292));
    }

    @Override
    public Book getBook(int id) {
        return booksRepo.stream()
                .filter(b -> b.getId() == id)
                .findAny()
                .orElse(null);
    }
    @Override
    public Book deleteBook(int id) {
        Book bookToDelete = getBook(id);
        if (bookToDelete != null) {
            booksRepo.remove(bookToDelete);
            return bookToDelete;
        }
        return null;
    }

    
    public Book createBook(int id, String title, String author, int pages) {
        Book newBook = new Book(id, title, author, pages);
        booksRepo.add(newBook);
        return newBook;
    }


}
