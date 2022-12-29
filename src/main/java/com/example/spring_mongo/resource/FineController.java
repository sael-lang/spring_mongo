package com.example.spring_mongo.resource;

import com.example.spring_mongo.model.Pay;
import com.example.spring_mongo.repository.FineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
public class FineController {
    @Autowired
    private FineRepository f;
    @PostMapping("/addFine")
    public String saveFine(@RequestBody Pay pay) {
        f.save(pay);
        return "Added fine with id : " + f;
    }
    @GetMapping("/findfine/{month}")
    public Optional<Pay> getfine(@PathVariable int month){
        return f.findById(month);
    }
}
