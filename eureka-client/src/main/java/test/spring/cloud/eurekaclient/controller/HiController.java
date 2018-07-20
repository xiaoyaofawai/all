package test.spring.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author wangbx
 * Created by wangbx on 2018/7/6.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    Random random = new Random(10);

    @GetMapping("hi")
    public String home(@RequestParam String name) {

        // 测试超时重试
        int rand = random.nextInt();
        System.out.println(rand);
        System.out.println(port);

        if("8765".equals(port) && rand % 2 == 0) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "hi" + name + ", i am from port:" + port;
    }
}
