package core.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置猫类
 *
 * @author yiyh
 */
@Configuration
public class CatConfiguration {

    /**
     * 初始化cat对象
     *
     * @return Cat对象
     */
    @Bean
    public Cat initCat() {
        return new Cat();
    }

}
