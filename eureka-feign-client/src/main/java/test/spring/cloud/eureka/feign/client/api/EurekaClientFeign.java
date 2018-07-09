package test.spring.cloud.eureka.feign.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import test.spring.cloud.eureka.feign.client.config.FeignConfig;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/9.
 */
@FeignClient(value = "EUREKA-CLIENT", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    /**
     * Feign demo
     * @param name
     * @return
     */
//    @GetMapping(value = "/hi")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
