package com.example.spring_mongo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {
@Id
     public int id;
    public String bookname;
    public String status;
    public int month;

}
