package com.cn.lc.springboot.service.imp;

import com.cn.lc.springboot.dao.UserMapper;
import com.cn.lc.springboot.model.entity.TestUser;
import com.cn.lc.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TestUser record) {
        return 0;
    }

    @Override
    public TestUser selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<TestUser> selectAll() {

        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TestUser record) {
        return 0;
    }
}
