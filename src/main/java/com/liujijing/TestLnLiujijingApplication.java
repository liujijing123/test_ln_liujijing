package com.liujijing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.liujijing.mapper"})
public class TestLnLiujijingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLnLiujijingApplication.class, args);
    }

}
