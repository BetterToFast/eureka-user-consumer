package cn.tcbd.eurekauserconsumer.controller;

import cn.tcbd.entity.User;
import cn.tcbd.eurekauserconsumer.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import java.util.ArrayList;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(String name,String password){
        //ArrayList<Object> l = new ArrayList<>();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        if (userService.login(user))
            return "success";
        return "error";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        for (int i=0;i<10;i++){
            userService.text(i);
        }
        System.out.println("ef");
       return "打印了";
    }




}
