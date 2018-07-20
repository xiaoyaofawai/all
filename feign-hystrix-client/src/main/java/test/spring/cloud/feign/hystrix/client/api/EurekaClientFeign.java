package test.spring.cloud.feign.hystrix.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/9.
 */
@FeignClient(value = "EUREKA-CLIENT", fallback = HystrixFeignFallback.class)
public interface EurekaClientFeign {

    /**
     * Feign demo
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

}

@Component
class HystrixFeignFallback implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "I'm sorry " + name + ", false";
    }
}
