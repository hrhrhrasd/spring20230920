package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto34;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao10 {

    @Select("""
        select CustomerName from customers
        where CustomerID = #{i}
""")
    String getCustomerNameById(int i);

    @Select("""
        select * from customers
        where CustomerID = #{i}
""")
    MyDto34 getCustomerById(int i);
}
