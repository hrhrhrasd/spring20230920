package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto33;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyDao9 {

    @Insert("""
        insert into employees (firstName, lastName, birthDate, notes)
        value (#{firstName}, #{lastName}, #{birthDate}, #{notes})
""")
    int insertEmployee(MyDto33 dto);
}
