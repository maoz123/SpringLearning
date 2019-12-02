package com.learning.controller;

import com.learning.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Autowired
    private Service service;

    @RequestMapping("/hello")
    public String hello()
    {
        service.print();
        return "service print";
    }
}
