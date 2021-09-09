package com.hongkongcoder.salon.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongkongcoder.salon.model.SalonServiceDetail;

@RestController
@RequestMapping("/api")
public class SalonController {



    @GetMapping(path = "/salon/{id}")
    public SalonServiceDetail get(@PathParam("id") String id) {
        return new SalonServiceDetail();
    }
    
}
