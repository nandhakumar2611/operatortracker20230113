package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.operatorTracker.mapper")
@SpringBootApplication
public class AppApi {

    public static void main(String[] args) {
        SpringApplication.run(AppApi.class, args);
        System.out.println("***********************************************\n");
        System.out.println("(♥◠‿◠)ﾉﾞ APP API Start Successfully ლ(´ڡ`ლ)ﾞ\n");
        System.out.println("***********************************************\n");
    }

}
