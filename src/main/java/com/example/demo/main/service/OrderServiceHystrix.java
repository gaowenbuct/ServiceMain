package com.example.demo.main.service;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceHystrix implements OrderService {
    @Override
    public String sayHiOrder(String name) {
        return "sorry "+name;
    }
}
