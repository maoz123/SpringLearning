package com.learning.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IndexDao {
    @Select("select * from db")
    public void insert();
}
