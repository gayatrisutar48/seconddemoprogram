package com.secondexample.seconddemoprogram.impl;

import com.secondexample.seconddemoprogram.myimnterface.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements DemoInterface {
    @Override
    public String checkDiandIoc() {
        return "Hello Spring Boot";
    }

}
