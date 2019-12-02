package com.learning.dao;

import com.learning.annotation.Validation;

//@Repository
//@Profile("staging")
public class DaoImpl2 implements Dao{
    @Validation
    public void print() {
        System.out.println("this is my second com.learning.dao");
    }
}
