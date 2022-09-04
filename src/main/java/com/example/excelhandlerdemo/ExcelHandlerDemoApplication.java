package com.example.excelhandlerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.excelhandlerdemo.dao")
public class ExcelHandlerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcelHandlerDemoApplication.class, args);
    }

}
