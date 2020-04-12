package com.zhihao.miao.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息初始化配置
 *
 * @author yiyh
 */
@SpringBootConfiguration
public class LoadedUserConfiguration {

    /**
     * 创建一个map结合bean
     *
     * @return map集合bean
     */
    @Bean
    public Map<Object,Object> createLoadedUser() {
        final int mapSize = 2;
        Map<Object,Object> loadedUser = new HashMap<>(mapSize);
        loadedUser.put("username", "zhihao.miao");
        loadedUser.put("age", 27);
        return loadedUser;
    }
}
