package com.cn.lc.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @RestController 的意思就是 Controller 里面的方法都以 json 格式输出，不用再写什么 jackjson 配置的
 */
@RestController
public class HelloWorldController {
//   @RequestMapping("/api/lc/hellospringboot")
    @RequestMapping(value = "/api/lc/hellospringboot", method = RequestMethod.GET)
    public String index() {
        return "Hello springboot!!react蚂蚁金服设计";
    }
    @RequestMapping(value = "/api/lc/getTableData", method = RequestMethod.GET)
    public List getTableData() {
        List tableData = new ArrayList();
        Map map = new HashMap();
        map.put("userName", "李彩SpringBoot");
        map.put("age", "12");
        for (int i = 0; i < 99; i++) {
            tableData.add(map);
        }
        return  tableData;
    }

}
