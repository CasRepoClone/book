package pl.edu.pwr.ztw.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class BooksControler {

    @Autowired
    IBooksService booksService;

    @RequestMapping(value = "/create/book", method=RequestMethod.POST)
    public ResponseEntity<Object> createBook(@RequestParam int id, @RequestParam String title, @RequestParam String author, @RequestParam int pages) {
        return new ResponseEntity<>(booksService.createBook(id, title, author, pages), HttpStatus.OK);
    }
    

    // read
    @RequestMapping(value = "/get/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBook(@PathVariable("id") int id) {
        return new ResponseEntity<>(booksService.getBook(id), HttpStatus.OK);
    }
    // delete
    @DeleteMapping("/delete/book/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable("id") int id) {
        return new ResponseEntity<>(booksService.deleteBook(id), HttpStatus.OK);
    }

}
