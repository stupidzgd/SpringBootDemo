package com.zgd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //使用SpringApplication的静态方法启动springApplication
        SpringApplication.run(DemoApplication.class, args);
    }
}
