package cn.tcbd.eurekauserconsumer.service.impl;

import cn.tcbd.entity.User;
import cn.tcbd.eurekauserconsumer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFBImpl implements UserService {


    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String text(Integer count) {
        return "这是熔断处理，没有正确连接到provider";
    }
}
