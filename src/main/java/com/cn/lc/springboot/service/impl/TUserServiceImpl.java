package com.cn.lc.springboot.service.impl;

import com.cn.lc.springboot.entity.TUser;
import com.cn.lc.springboot.mapper.TUserMapper;
import com.cn.lc.springboot.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author licai
 * @since 2019-07-08
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
