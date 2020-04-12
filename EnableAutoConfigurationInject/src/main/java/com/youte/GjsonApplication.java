package com.youte;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 应用启动类
 *
 * @author yiyh
 */

@SpringBootApplication
public class GjsonApplication {

    @Bean
    public Gson createGson(){
        return new Gson();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(GjsonApplication.class,args);
        System.out.println(context.getBeansOfType(Gson.class));
    }
}
