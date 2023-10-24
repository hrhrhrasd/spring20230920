package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto40;
import com.example.spring20230920.domain.MyDto41;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.Map;

@Mapper
public interface MyDao7 {
    @Select("""
        select * from customers
        where CustomerID=#{id}
""")
    Map<String, Object> selectByCustomerId(Integer id);

    @Select("""
        select * from employees
        where EmployeeID = #{id}
""")
    Map<String, Object> selectByEmployeeId(Integer id);

    @Select("""
""")
    void selectByEmployeeId2(Integer id);

    @Insert("""
        insert into employees (lastname, firstname, birthdate)
        values (#{lastName}, #{firstName}, #{birthDate})
""")
    void insertEmployee(String lastName, String firstName, LocalDate birthDate);

    @Insert("""
        insert into products (productname, categoryid, price)
        values (#{name}, #{category}, #{price})
""")
    int insertproduct(String name, Double price, Integer category);

    @Delete("""
        delete from products
        where ProductID = #{pid}
""")
    int deleteByProductId(Integer pid);

    @Delete("""
        delete from customers
        where CustomerID = #{cid}
""")
    int deleteByCustomerId(Integer cid);

    @Update("""
        update products
        set ProductName = #{name},
        CategoryID = #{category},
        Price = #{price}
        where ProductID = #{id}
""")
    int updateProduct(MyDto40 dto);

    @Update("""
        update employees
        set LastName = #{lastName},
        FirstName = #{firstName},
        BirthDate = #{birthDate}
        where EmployeeID = #{id}
""")
    int updateEmployee(MyDto41 dto);
}
