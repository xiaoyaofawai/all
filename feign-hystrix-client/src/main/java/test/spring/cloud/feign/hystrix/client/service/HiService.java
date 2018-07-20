package test.spring.cloud.feign.hystrix.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.cloud.feign.hystrix.client.api.EurekaClientFeign;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/9.
 */
@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {

        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

}
