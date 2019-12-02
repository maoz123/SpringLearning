package com.learning.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao {
    @Select("insert * into XAXD")
    void print();
}
