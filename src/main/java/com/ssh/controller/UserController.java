package com.ssh.controller;

import com.ssh.pojo.User;
import com.ssh.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/save.do" , method = RequestMethod.POST)
    public void save(String userName , String userPassword){

        User user = new User(userName,userPassword);
        try{
            userService.save(user);
        }

        catch(Exception e){
            e.printStackTrace();
        }


    }

}
