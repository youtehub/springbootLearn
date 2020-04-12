package com.youte;

import core.bean.Cat;
import core.bean.Dog;
import core.bean.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动类
 *
 * @author yiyh
 */

@EnableAutoConfiguration
//@DefinitionEnableAutoConfiguration
@ComponentScan
public class InitializedApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(InitializedApplication.class, args);
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = applicationContext.getBean(Dog.class);
        System.out.println(dog);
        People people = applicationContext.getBean(People.class);
        System.out.println(people);
    }
}
