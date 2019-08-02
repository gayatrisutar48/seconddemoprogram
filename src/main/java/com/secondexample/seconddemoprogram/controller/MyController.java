package com.secondexample.seconddemoprogram.controller;


import com.secondexample.seconddemoprogram.impl.MyImpl;
import com.secondexample.seconddemoprogram.impl.MyImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping(value = "/getdata")
    public String getData(){
        return myImpl.checkDiandIoc();
    }


    @Autowired
    private MyImpl1 myImpl1;

    @GetMapping(value = "/getdata1")
public String getData1(){
        return myImpl1.check();
    }
}
