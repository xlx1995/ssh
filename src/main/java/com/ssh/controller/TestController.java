package com.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping(value = "/test1.do")
        public String test(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
            return "test";
    }


}
