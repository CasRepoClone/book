package pl.edu.pwr.ztw.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService implements IBooksService {

    private static final List<Book> booksRepo = new ArrayList<>();

    private static final List<authorsRepo> authors = new ArrayList<>();

    static {
        // ill be the first to admit im not updating all the ids to integers at 2am and expecting the code to work; 
        booksRepo.add(new Book(1, "Potop", "1", 936));
        booksRepo.add(new Book(2, "Wesele", "2", 150));
        booksRepo.add(new Book(3, "Dziady", "3", 292));
    }

    static {
        authors.add(new authorsRepo("1", "Henryk Sienkiewicz"));
        authors.add(new authorsRepo("2", "Stanisław Reymont"));
        authors.add(new authorsRepo("3", "Adam Mickiewicz"));
    }


    @Override
    public authorsRepo getAuthor(String id) {
        return authors.stream()
                .filter(a -> a.getId().equals(id))
                .findAny()
                .orElse(null);
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

    @Override
    public Book createBook(int id, String title, String author, int pages) {
        Book newBook = new Book(id, title, author, pages);
        booksRepo.add(newBook);
        return newBook;
    }
    @Override
    public Book updateBook(int id, String title, String author, int pages) {
        Book bookToUpdate = getBook(id);
        if (bookToUpdate != null) {
            bookToUpdate.setTitle(title);
            bookToUpdate.setAuthor(author);
            bookToUpdate.setPages(pages);
            return bookToUpdate;
        }
        return null;
    }
}
