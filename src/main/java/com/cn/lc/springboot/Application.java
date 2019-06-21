package com.cn.lc.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//全局配置系统对mapper接口扫描
@MapperScan("com.cn.lc.springboot.dao")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
