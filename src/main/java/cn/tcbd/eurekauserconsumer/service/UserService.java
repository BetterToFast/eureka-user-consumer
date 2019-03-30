package cn.tcbd.eurekauserconsumer.service;

import cn.tcbd.entity.User;
import cn.tcbd.eurekauserconsumer.service.impl.UserServiceFBImpl;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-USER-PROVIDER",fallback = UserServiceFBImpl.class)
public interface UserService {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(User user);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String text(@RequestParam("count")Integer  count);


}
