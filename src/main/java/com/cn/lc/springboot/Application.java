package com.cn.lc.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 扫描servlet||filter
@ServletComponentScan
//全局配置系统对mapper接口扫描
@MapperScan("com.cn.lc.springboot.dao")
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        LOGGER.info("The  application has been started successfully!");
    }

}
