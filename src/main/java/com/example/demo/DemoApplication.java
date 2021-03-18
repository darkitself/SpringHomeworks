package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    static MegaBean megaBean;

    @Autowired
    public void setMegaBean(MegaBean megaBean){
        DemoApplication.megaBean = megaBean;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        megaBean.firstBean.print();
        megaBean.secondBean.print();
        megaBean.thirdBean.print();
    }
}
