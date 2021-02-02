package com.douyuehan.doubao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.douyuehan.doubao.mapper")
@SpringBootApplication
public class DoubaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubaoApplication.class, args);
    }

}
