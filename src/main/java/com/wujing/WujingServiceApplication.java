package com.wujing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wujing"})
@MapperScan("com.wujing.service.mapper")
public class WujingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WujingServiceApplication.class, args);
    }

}
