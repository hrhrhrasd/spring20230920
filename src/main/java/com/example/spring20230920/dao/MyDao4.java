package com.example.spring20230920.dao;

import com.example.spring20230920.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface MyDao4 {
    @Select("""
        select CustomerName from customers
        where CustomerID = #{i}
""")    //파라미터가 하나면 이름이 일치하지 않아도 됨
    String select1(int i);

    @Select("""
        select distinct ProductName from products p join orderdetails od
        on od.ProductID = p.ProductID
        join orders o on o.OrderID = od.OrderID
        where OrderDate >= #{from} and OrderDate <= #{to}
        order by ProductName
""")
    List<String> select3(LocalDate from, LocalDate to);

    @Select("""
        select ProductName from products
        where Price between #{min} and #{max}
""")
    List<String> select(MyDto25 dto);

    @Select("""
        select CustomerName from customers
        where Country = #{country1} or Country = #{country2}
""")
    List<String> select5(MyDto26 dto);

    @Select("""
        select OrderDate from orders
        where OrderDate between #{dto1.from} and #{dto2.to}
""")
    List<String> select6(MyDto27 dto1, MyDto28 dto2);

    @Select("""
        select CustomerName from customers
        where CustomerName
        like #{dto2.keyword}
        limit #{dto1.from}, #{dto1.rows}
""")
    List<String> select7(MyDto29 dto1, MyDto30 dto2);

    @Insert("""
        insert into customers (CustomerName, Country)
        value (#{name}, #{country})
""")
    int insert1(MyDto31 dto);

    @Insert("""
        insert into employees(LastName, FirstName)
        value (#{lastName}, #{firstName})
""")
    int insert2(MyDto32 emp);
}
