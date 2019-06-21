package com.cn.lc.springboot.dao;

import com.cn.lc.springboot.model.entity.TestUser;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

//    @Select("SELECT * FROM test_user")
//    @Results({
//            @Result(property = "id",  column = "id"),
//            @Result(property = "name", column = "name")
//    })
    List<TestUser> selectAll();

    int updateByPrimaryKey(TestUser record);
}