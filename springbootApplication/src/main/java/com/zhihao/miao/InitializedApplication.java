package com.zhihao.miao;

import com.zhihao.miao.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * 用户类
 *
 * @author yiyh
 */
@SpringBootApplication
//@ComponentScan
public class InitializedApplication {

    @Bean
    public Runnable createRunnable() {
        return () -> System.out.println("spring boot is running");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(InitializedApplication.class, args);
        context.getBean(Runnable.class).run();
        System.out.println(context.getBean(User.class));
        Map map = (Map) context.getBean("createMap");
        int age = (int) map.get("age");
        System.out.println("age==" + age);
    }
}
