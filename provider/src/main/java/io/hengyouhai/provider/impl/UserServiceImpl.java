package io.hengyouhai.provider.impl;

import io.hengyouhai.interfaces.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "Hello! "+name;
    }
}
