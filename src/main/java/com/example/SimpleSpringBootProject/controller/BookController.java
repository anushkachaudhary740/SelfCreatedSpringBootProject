package com.example.SimpleSpringBootProject.controller;

import com.example.SimpleSpringBootProject.model.Book;
import com.example.SimpleSpringBootProject.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookServices bookServices;
    @GetMapping("/get")
    public List<Book> restBook(){
        return this.bookServices.getAllBook();
    }
    @GetMapping("/get/{id}")
    public Book restBook(@PathVariable("id") int id){
        return this.bookServices.getBookById(id);
    }
    @PostMapping("/post")
    public Book addBook(@RequestBody Book book){
          this.bookServices.postBook(book);
          return book;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable("id") int id){
        this.bookServices.deleteBookById(id);
    }
    @PutMapping("/put/{id}")
    public Book restBook(@RequestBody Book book,@PathVariable("id") int id){
         this.bookServices.updateBookById(book,id);
         return book;
    }
}
