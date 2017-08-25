package com.liusong.impl;

import com.liusong.service.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public String getUpperName(String name) {
        return name.toUpperCase();
    }
}
