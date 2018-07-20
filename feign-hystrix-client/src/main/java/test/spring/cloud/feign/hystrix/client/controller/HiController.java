package test.spring.cloud.feign.hystrix.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.spring.cloud.feign.hystrix.client.service.HiService;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/9.
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "wbx", required = false) String name) {
        return hiService.sayHi(name);
    }
}
