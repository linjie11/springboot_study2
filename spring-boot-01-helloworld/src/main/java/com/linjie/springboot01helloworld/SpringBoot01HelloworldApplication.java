package com.linjie.springboot01helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注一个主程序类，说明这是一个Spring boot应用
 */

@SpringBootApplication
public class SpringBoot01HelloworldApplication {

    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(SpringBoot01HelloworldApplication.class, args);
    }

}
