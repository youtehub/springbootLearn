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
public class UserInfoConfiguration {

    /**
     * 创建一个map结合bean
     *
     * @return map集合bean
     */
    @Bean
    public Map createUserInfo() {
        final int MAP_SIZE = 2;
        Map userInfo = new HashMap<>(MAP_SIZE);
        userInfo.put("username", "zhihao.miao");
        userInfo.put("age", 27);
        return userInfo;
    }
}
