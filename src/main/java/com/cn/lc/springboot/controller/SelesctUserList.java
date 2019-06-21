package com.cn.lc.springboot.controller;

import com.cn.lc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelesctUserList {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/api/lc/getTabledata", method = RequestMethod.GET)
    @GetMapping("/api/lc/getTabledata")
    public List getUserData () {

        return  userService.selectAll();

    }

}
