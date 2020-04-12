package com.zhihao.miao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot 启动类
 *
 * @author yiyh
 */
@SpringBootApplication(exclude = People.class)
public class ApplicationPeople {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationPeople.class, args);
        People people = context.getBean(People.class);
        System.out.println(people);
    }
}
