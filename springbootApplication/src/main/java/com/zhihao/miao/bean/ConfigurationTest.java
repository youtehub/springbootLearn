package com.zhihao.miao.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置测试
 *
 * @author yiyh
 */
@SpringBootConfiguration
public class ConfigurationTest {

    /**
     * 创建一个map结合bean
     *
     * @return map集合bean
     */
    @Bean
    public Map createMap() {
        final int MAP_SIZE = 2;
        Map map = new HashMap<>(MAP_SIZE);
        map.put("username", "zhihao.miao");
        map.put("age", 27);
        return map;
    }
}
