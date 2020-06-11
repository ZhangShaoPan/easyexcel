package com.zsp.easyexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zsp.easyexcel.dao")
public class EasyExcelMain7010 {
    public static void main(String[] args) {
        SpringApplication.run(EasyExcelMain7010.class, args);
    }

}
