package com.zhihao.miao.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置config
 *
 * @author yiyh
 */
@Configuration
public class CatConfiguration {

    /**
     * 初始化cat
     *
     * @return cat对象
     */
    @Bean
    public Cat cat() {
        return new Cat();
    }
}
