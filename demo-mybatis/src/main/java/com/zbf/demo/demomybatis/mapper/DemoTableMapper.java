package com.zbf.demo.demomybatis.mapper;


import com.zbf.demo.demomybatis.pojo.db.DemoTablePojo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * @author baofeng.zhang
 */
public interface DemoTableMapper {

    @Select("select * from demo_table_01 where id = ${id}")
    @Results(id = "student", value = {
            @Result(property = "id", column = "id", javaType = String.class),
            @Result(property = "arg01", column = "arg01", javaType = String.class),
            @Result(property = "arg02", column = "arg02", javaType = String.class),
            @Result(property = "createTime", column = "create_time", javaType = Date.class)
    })
    List<DemoTablePojo> getById(String id);
}