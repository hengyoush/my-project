package io.hengyouhai.consumer;

import io.hengyouhai.interfaces.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference
    private UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return userService.sayHello(name);
    }
}
