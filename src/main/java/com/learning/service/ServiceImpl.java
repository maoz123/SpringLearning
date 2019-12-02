package com.learning.service;

import com.learning.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Dao dao;

    public void print()
    {
        System.out.println("this is my first com.learning.service");
        dao.print();
    }

    @PostConstruct
    public void setup()
    {
        System.out.println("set up properties");
    }
}
