package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SecondBean {

    @Autowired
    FirstBean firstBean;
    @Autowired
    FirstBean firstBean2;
    public String getName() {
        return "SecondBean";
    }

    @PostConstruct
    public void printAfterCreation() {
        System.out.print(getName() + " with code " + this.hashCode() + " constructed" + '\n');
    }

    @PreDestroy
    public void printBeforeDestruction() {
        firstBean.printBeforeDestruction();
        firstBean2.printBeforeDestruction();
        System.out.print(getName() + " with code " + this.hashCode() + " destroyed" + '\n');
    }
}
