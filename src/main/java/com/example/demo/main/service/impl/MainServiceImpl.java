package com.example.demo.main.service.impl;

import com.example.demo.main.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "mainService")
public class MainServiceImpl implements MainService {
    private static final Logger log = LoggerFactory.getLogger(MainServiceImpl.class);
    @Value("${server.port}")
    String port;
    @Override
    public String sayHi(String name) {
        log.info("sayHi called");
        return "Hi "+name+",i am from port:" +port;
    }
}
