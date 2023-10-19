package com.example.spring20230920.dao;

import com.example.spring20230920.domain.MyDto36;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface MyDao5 {

@Select("""
        <script>
        select count(*)
        from customers
        <if test='country != null'>
        where Country = #{country}
        </if>
        </script>
""")
    int select1(String country);

@Select("""
        <script>
            select CustomerName from customers
            <if test='number == 10'>
            -- number = 10
            </if>
            <if test='number !== 10'>
            -- number != 10
            </if>
            <if test='number > 10'>
            -- number > 10
            </if>
            <if test='number lt 10'>
            -- number lt 10
            </if>
        </script>
""")
    List<String> select2(Integer number);

@Select("""
    <script>
        select customerName, contactName
        from customers
        <if test = 'code == 1'>
        where customerName like #{s}
        </if>
        <if test = 'code == 2'>
        where contactName like #{s}
        </if>
    </script>
""")
    List<Map<String, Object>> select3(Integer code, String s);

@Select("""
        <script>
        select count(*) from customers
        where  
            <if test='i gt 10'>
            -- i 가 10보다 큼
            </if>
            <if test='i lt 10'>
            -- i 가 10보다 작음
            </if>
            <if test='(i gt 0) and (i lt 100)'>
            -- i가 0 100 사이
            </if>
        </script>
""")
    String select4(int i);

@Select("""
    select * from customers
    where CustomerName < 'a';
""")
    String select5();

@Select("""
<script>
<![CDATA[
select * from customers
where CustomerName < 'a';
]]>
</script>
""")
    String select6();

@Select("""
    <script>
    select * from customers
    where Country in
    <foreach collection="list" 
    item="elem" 
    separator=", "
    open="("
    close=")">
        #{elem}
    </foreach>
    </script>
""")
    String select7(List<String> list);

@Select("""
    <script>
    select * from customers
    where 
        <trim prefixOverrides="or">
            <foreach collection="args"
                    item="elem">
                or country = #{elem}
            </foreach>
        </trim>
    </script>
""")
    String select8(List args);

    @Select("""
            <script>
            <bind name="alterKeyword" value="'%' + keyword + '%'" />
            SELECT *
            FROM customers
            WHERE customerName LIKE #{alterKeyword}
            </script>
            """)
    String select9(String keyword);

    @Select("""
            <script>
                SELECT * FROM customers
                WHERE
                    <if test="word == 'abc'">
                        -- word는 abc
                    </if>
                    <if test='word == "def"'>
                        -- word는 def
                    </if>
                    <if test="word == 'q'">
                        -- word는 q
                    </if>
                    <if test='word == "k"'>
                        -- word는 k
                    </if>
            </script>
            """)
    String select10(String word);

@Select("""
    select DISTINCT City from customers
    where City is not null and city != ''
    order by 1
""")
    List<String> listCustomerCity();

@Select("""
    select distinct Country from  customers
    where Country is not null and Country != ''
    order by 1
""")
    List<String> listCustomerCountry();

@Select("""
    <script>
    select CustomerName name, city, country
    from customers
    <trim prefix="where">
    <if test='type == "1"'>
        city
        <foreach collection="city" item="elem" open=" in ("
        separator=", " close=")">
            #{elem}
        </foreach>
    </if>
    <if test='type == "2"'>
        country
        <foreach collection="country" item="elem" open=" in ("
        separator=", " close=")">
            #{elem}
        </foreach>
    </if>
    </trim>
    order by name, country, city
    </script>
""")
    List<Map<String, Object>> listCustomer(MyDto36 dto);
}
