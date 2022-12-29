package com.example.spring_mongo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Pay")
public class Pay {
    @Id
    public int id;
    public String name;
    public String fine;
    public int month;
}
