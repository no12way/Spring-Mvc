package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank {
    @RequestMapping("/bank")
    public String bankService(String name,Double balance){
        System.out.println(name+"还剩"+balance+"余额");
        return "Hello";
    }
}
