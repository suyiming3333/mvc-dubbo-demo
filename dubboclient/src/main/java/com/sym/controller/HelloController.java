package com.sym.controller;


import com.sym.service.HelloServiceI;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/helloController")
public class HelloController {

    Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private HelloServiceI helloService;

    @RequestMapping(value = "/sayhi")
    @ResponseBody
    public String sayHello(){
        String result = helloService.sayHello("suyiming");
        return result;
    }

}
