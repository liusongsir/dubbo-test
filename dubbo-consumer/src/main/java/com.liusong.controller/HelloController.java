package com.liusong.controller;

import com.liusong.service.IHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/")
public class HelloController {

    @Resource
    private IHelloService helloService;

    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        System.out.println("helloService is null:" + (helloService == null));
        helloService.sayHello(name);
        return "Say Hello Success";
    }

    @RequestMapping(value = "/upper/{name}")
    @ResponseBody
    public String getUpperName(@PathVariable String name){
        return helloService.getUpperName(name);
    }
}
