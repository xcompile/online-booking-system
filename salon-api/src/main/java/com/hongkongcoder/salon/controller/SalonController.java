package com.hongkongcoder.salon.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongkongcoder.salon.model.SalonServiceDetail;

@RestController
@RequestMapping("/api/salon")
@CrossOrigin(origins="http://localhost:3000")
public class SalonController {



    @GetMapping(path = "/{id}")
    public SalonServiceDetail get(@PathVariable("id") String id) {
        return new SalonServiceDetail();
    }
    
}
