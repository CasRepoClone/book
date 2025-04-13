package pl.edu.pwr.ztw.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController

public class BooksControler {

    @Autowired
    IBooksService booksService;
    // create book
    //#region -- Book --
    @RequestMapping(value = "/create/book", method=RequestMethod.POST)
    public ResponseEntity<Object> createBook(@RequestParam int id, @RequestParam String title, @RequestParam String author, @RequestParam int pages) {
        return new ResponseEntity<>(booksService.createBook(id, title, author, pages), HttpStatus.OK);
    }
    // update book
    @RequestMapping(value = "/update/book/{id}", method=RequestMethod.POST)
    public ResponseEntity<Object> updateBook(@RequestParam int id, @RequestParam String title, @RequestParam String author, @RequestParam int pages) {
        return new ResponseEntity<>(booksService.updateBook(id, title, author, pages), HttpStatus.OK);
    }

    // read book
    @RequestMapping(value = "/get/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getBook(@PathVariable("id") int id) {
        return new ResponseEntity<>(booksService.getBook(id), HttpStatus.OK);
    }
    // delete book
    @DeleteMapping("/delete/book/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable("id") int id) {
        return new ResponseEntity<>(booksService.deleteBook(id), HttpStatus.OK);
    }
    //#endregion
    
    // create author 
    @PostMapping("/create/author")
    public ResponseEntity<Object> createAuthor(@RequestParam String id, @RequestParam String author) {
        return new ResponseEntity<>(booksService.createAuthor(id, author), HttpStatus.OK);
    }
    // read author 
    @GetMapping("/get/author/{id}") // in future change this to take an int 
    public ResponseEntity<Object> getAuthor(@PathVariable("id") int id) {
        return new ResponseEntity<>(booksService.getAuthor(String.valueOf(id)), HttpStatus.OK);
    }
    // update author 
    @PostMapping("/update/author/{id}")
    public ResponseEntity<Object> updateAuthor(@PathVariable("id") String id, @RequestParam String author) {
        return new ResponseEntity<>(booksService.updateAuthor(id, author), HttpStatus.OK);
    }

    //    @PostMapping("/delete/author/{id}")
    //  public String postMethodName(@PathVariable("id") String id) {
    //    return new ResponseEntity<>(booksService.deleteAuthor)
    //}
    
     

    
    
    
    

}
