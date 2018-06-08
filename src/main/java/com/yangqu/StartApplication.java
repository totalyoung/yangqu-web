package com.yangqu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yangst on 2018/6/1.
 */
@EnableAspectJAutoProxy
@MapperScan("com.yangqu.mvc.*.dao")
@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);

    }
}
