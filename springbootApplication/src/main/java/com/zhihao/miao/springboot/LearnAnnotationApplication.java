package com.zhihao.miao.springboot;

import com.zhihao.miao.bean.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 学习注解的 启动类
 *
 * @author yiyh
 */
@SpringBootApplication(scanBasePackages = "com.zhihao.miao")
public class LearnAnnotationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LearnAnnotationApplication.class, args);
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
        System.out.println();
    }
}
