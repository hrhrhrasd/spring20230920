package com.example.spring20230920.dao;

import com.example.spring20230920.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao3 {
    @Select("""
        select CustomerName from customers
        where CustomerID = 1
""")
    String select1();

    @Select("""
        select Price from products
        where ProductID = 1
""")
    Double select2();

    @Select("""
        select LastName from employees
        where EmployeeID = 1
""")
    String select3();

    @Select("""
        select BirthDate from employees
        where EmployeeID = 2
""")
    LocalDate select4();

    @Select("""
        select DISTINCT Country from customers
        order by 1
""")
    List<String> select5();

    @Select("""
        select BirthDate from employees
        order by 1
""")
    List<LocalDate> select6();

    @Select("""
        select Price from products
        order by 1
""")
    List<Double> select7();

    @Select("""
        select CustomerID, CustomerName, Address from customers
        where CustomerID = 1
""")
    Map<String, Object> select8();

    @Select("""
        select ProductName, Price, CategoryName from products
        join categories
        on products.CategoryID = categories.CategoryID
        where ProductID = 1
""")
    Map<String, Object> select9();

    @Select("""
        select EmployeeID, LastName, FirstName from employees
        where EmployeeID = 1
""")
    MyDto19 select10();

    @Select("""
        select ProductName, Price, CategoryName from products
        join categories
        on products.CategoryID = categories.CategoryID
        where ProductID = 1
""")
    MyDto20 select11();

    @Select("""
        select CustomerID id, CustomerName name, Country from customers
        where CustomerID = 2
""")
    MyDto21 select12();

    @Select("""
        select CustomerID, CustomerName, Address from customers
        order by 1
""")
    List<Map<String, Object>> select13();

    @Select("""
        select ProductName, Quantity, Price from products p join orderdetails od
        on p.ProductID = od.ProductID
        join orders o
        on od.OrderID = o.OrderID
        where o.OrderDate = '1996-07-04'
""")
    List<Map<String, Object>> select14();

    @Select("""
        select ProductName name, Quantity, Price from products p join orderdetails od
        on p.ProductID = od.ProductID
        join orders o
        on od.OrderID = o.OrderID
        where o.OrderDate = '1996-07-04'
""")
    List<MyDto22> select15();

    @Select("""
        select OrderDate, ProductName, CategoryName, Quantity, Price from products p join orderdetails od
        on p.ProductID = od.ProductID
        join orders o on od.OrderID = o.OrderID
        join categories c on c.CategoryID = p.CategoryID
        where c.CategoryID = 1
        order by OrderDate, ProductName
""")
    List<MyDto23> select16();
}
