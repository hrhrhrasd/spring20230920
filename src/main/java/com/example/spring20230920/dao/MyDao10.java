package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto34;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    @Select("""
        select LastName from employees
        where EmployeeID = #{id}
""")
    String getEmployeeById(int id);

    @Select("""
        select CustomerID from customers
        order by CustomerID
""")
    List<Integer> getCustomerIdList();

    @Select("""
        select EmployeeID from employees
        order by EmployeeID
""")
    List<Integer> getEmployeeIdList();

}
