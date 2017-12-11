package com.example.demo.main.controller;

import com.example.demo.main.service.OrderService;
import com.example.demo.main.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {
    @Resource
    MainService mainService;
    @Resource
    OrderService orderService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return mainService.sayHi(name);
    }
    @RequestMapping(value = "/hi-order",method = RequestMethod.GET)
    public String sayHiOrder(@RequestParam String name){
        return orderService.sayHiOrder(name);
    }
}
