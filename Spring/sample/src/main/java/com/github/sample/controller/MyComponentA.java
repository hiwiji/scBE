package com.github.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponentA {

    // 1. 필드 주입
    @Autowired
    private MyComponentB myComponentB;


    // 2. setter 주입
    public void setMyComponentB(MyComponentB myComponentB) {
        this.myComponentB = myComponentB;
    }

    public void sayHello() {
        String message = myComponentB.sayHello() + ", 그리고 난 MyComponentA";
        System.out.println(message);
    }


    //3. 생성자 주입  (@Autowired 써도되고 안써도되고)
    public MyComponentA(MyComponentB myComponentB) {
        this.myComponentB = myComponentB;
    }



}
