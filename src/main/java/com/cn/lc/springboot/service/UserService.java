package com.cn.lc.springboot.service;

import com.cn.lc.springboot.model.entity.TestUser;
import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    List<TestUser> selectAll();

    int updateByPrimaryKey(TestUser record);
}