package com.secondexample.seconddemoprogram.impl;

import com.secondexample.seconddemoprogram.myimnterface.DemoInterface1;
import org.springframework.stereotype.Service;


@Service
public class MyImpl1 implements DemoInterface1 {


    @Override
    public String check() {
        return "hiii";
    }
}
