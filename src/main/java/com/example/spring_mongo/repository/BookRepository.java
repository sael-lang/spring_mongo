package com.example.spring_mongo.repository;

import com.example.spring_mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {

}
