package com.learning.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class DaoImpl implements Dao {
    public void print() {
        System.out.println("this is the first com.learning.dao");
    }
}
