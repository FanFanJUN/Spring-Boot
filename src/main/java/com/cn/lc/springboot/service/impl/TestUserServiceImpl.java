package com.cn.lc.springboot.service.impl;

import com.cn.lc.springboot.entity.TestUser;
import com.cn.lc.springboot.mapper.TestUserMapper;
import com.cn.lc.springboot.service.TestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author licai
 * @since 2019-07-08
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements TestUserService {

}
