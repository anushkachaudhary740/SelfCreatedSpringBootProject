package com.example.SimpleSpringBootProject.services;
import com.example.SimpleSpringBootProject.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookServices {
    List<Book> book=new ArrayList<>();{
    book.add(new Book(11,"Bright Sky","Reema Kadam"));
    book.add(new Book(22,"Nature Beauty","Lakshmi Nagar"));
    book.add(new Book(33,"Water Fall","Himani Khukhera"));
    book.add(new Book(44,"Moony Days","Malkhumb Bhuwneshwar"));
    book.add(new Book(55,"The Girl With Power","Rapti Singh"));
    }
    public List<Book> getAllBook(){
        return book;
    }
    public Book getBookById(int id){
        Book b=null;
        b=book.stream().filter(e->e.getId()==id).findFirst().get();
        return b;
    }

    public void postBook(Book b) {
        book.add(b);
    }

    public void deleteBookById(int id) {
        book=book.stream().filter(e->e.getId()!=id).collect(Collectors.toList());

    }

    public void updateBookById(Book b, int id) {
        book.stream().map(e->{
            if(e.getId()==id) {
                e.setName(b.getName());
                e.setAuthor(b.getAuthor());
            }
            return e;
        }).collect(Collectors.toList());
    }

}

