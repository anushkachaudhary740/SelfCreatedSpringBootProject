package com.example.SimpleSpringBootProject.controller;

import com.example.SimpleSpringBootProject.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/get")
    public Book restBook(){
        Book book=new Book();
        book.setId(2);
        book.setName("Haven");
        book.setAuthor("HarSwaroop");
        return book;
    }
}
