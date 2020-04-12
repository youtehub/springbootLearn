package core.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置猫类
 *
 * @author yiyh
 */
@Configuration
public class DogConfiguration {

    /**
     * 初始化Dog对象
     *
     * @return Dog对象
     */
    @Bean
    public Dog initDog() {
        return new Dog();
    }

}
