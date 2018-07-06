package test.spring.cloud.eureka.ribbon.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.spring.cloud.eureka.ribbon.client.service.RibbonService;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/6.
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi (@RequestParam(required = false, defaultValue = "wbx") String name) {
        return ribbonService.hi(name);
    }
}
