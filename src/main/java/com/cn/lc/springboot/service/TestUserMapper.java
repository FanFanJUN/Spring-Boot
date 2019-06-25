package com.cn.lc.springboot.service;

import com.cn.lc.springboot.model.entity.TestUser;
import java.util.List;

public interface TestUserMapper {
    int insert(TestUser record);

    List<TestUser> selectAll();
}