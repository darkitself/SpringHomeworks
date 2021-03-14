package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "prototype")
public class FirstBean {

    public String getName() {
        return "FirstBean";
    }

    @PostConstruct
    public void printAfterCreation() {
        System.out.print(getName() + " with code " + this.hashCode() + " constructed" + '\n');
    }

    @PreDestroy
    public void printBeforeDestruction() {
        System.out.print(getName() + " with code " + this.hashCode() + " destroyed" + '\n');
    }
}
