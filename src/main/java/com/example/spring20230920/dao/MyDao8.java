package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto33;
import com.example.spring20230920.domain.MyDto45;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface MyDao8 {

    @Select("""
        select * from products
        where ProductID = #{id}
""")
    Map<String, Object> selectProductById(Integer id);

    @Select("""
        select EmployeeID id, lastName, firstName, photo, notes, birthDate 
        from employees 
        where EmployeeID = #{id}
""")
    MyDto33 selectEmployeeById(Integer id);

    @Select("""
        select p.ProductID id, price, c.CategoryName category, unit
        from products p join categories c
        on p.CategoryID = c.CategoryID
        where p.ProductID = #{id}
""")
    MyDto45 selectProdById2(Integer id);
}
