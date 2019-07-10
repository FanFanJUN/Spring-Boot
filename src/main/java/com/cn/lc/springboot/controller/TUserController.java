package com.cn.lc.springboot.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.lc.springboot.entity.TestUser;
import com.cn.lc.springboot.service.TUserService;
import com.cn.lc.springboot.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author licai
 * @since 2019-07-08
 */
@RestController

public class TUserController {

    @Autowired
    private TestUserService testUserService;

    @RequestMapping("/api/lc/getall")
    public IPage<TestUser> getAll() {
        Page userPage = new Page(1,10);
//        return  testUserService.list();
        return testUserService.page(userPage);
    }

}
