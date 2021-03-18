package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MegaBean {
    public BaseBean firstBean;
    public BaseBean secondBean;

    @Autowired
    @Qualifier("thirdBean")
    public BaseBean thirdBean;

    MegaBean(BaseBean firstBean) {
        this.firstBean = firstBean;
    }

    @Autowired
    @Qualifier("secondBean")
    public void setSecondBean(BaseBean secondBean) {
        this.secondBean = secondBean;
    }

    public String getName() {
        return "MegaBean";
    }

    @PostConstruct
    public void printAfterCreation() {
        System.out.println(getName() + " with code " + this.hashCode() + " constructed");
    }

    @PreDestroy
    public void printBeforeDestruction() {
        System.out.println(getName() + " with code " + this.hashCode() + " destroyed");
    }
}