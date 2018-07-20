package test.spring.cloud.eureka.feign.client.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/9.
 */
@Configuration
public class FeignConfig {

    @Bean
    @Qualifier
    public Retryer feignRetryer() {
        return new Retryer.Default(100, 1000L, 5);
    }
}
