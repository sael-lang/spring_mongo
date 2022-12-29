package com.example.spring_mongo.repository;

import com.example.spring_mongo.model.Pay;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FineRepository extends MongoRepository<Pay,Integer> {
}
