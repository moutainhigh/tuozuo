package com.tuozuo.tavern.shuiruyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2019/08/10 <br>
 */
@MapperScan(basePackages = "com.tuozuo.tavern.shuiruyi.mapper")
@SpringBootApplication
@EnableAsync//开启异步调用
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
