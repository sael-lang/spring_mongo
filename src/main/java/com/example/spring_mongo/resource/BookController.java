package com.example.spring_mongo.resource;
import com.example.spring_mongo.model.Book;
import com.example.spring_mongo.model.Pay;
import com.example.spring_mongo.repository.BookRepository;
import com.example.spring_mongo.repository.FineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository b;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        b.save(book);
        return "Added book with id : " + b;
    }


    @GetMapping("/findbook/{id}")
    public Optional<Book> getbooks(@PathVariable int id){
        return b.findById(id);
    }
}
