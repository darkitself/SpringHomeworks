package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MegaBean {
    private FirstBean firstBean;
    private SecondBean secondBean;

    @Autowired
    MegaBean(FirstBean firstBean) {
        this.firstBean = firstBean;
    }

    @Autowired
    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public String getName() {
        return "MegaBean";
    }

    @PostConstruct
    public void printAfterCreation() {
        System.out.print(getName() + " with code " + this.hashCode() + " constructed" + '\n');
    }

    @PreDestroy
    public void printBeforeDestruction() {
        firstBean.printBeforeDestruction();
        System.out.print(getName() + " with code " + this.hashCode() + " destroyed" + '\n');
    }
}