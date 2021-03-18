package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
public class FirstBean implements BaseBean {

    @PostConstruct
    public void printAfterCreation() {
        System.out.println("FirstBean with code " + this.hashCode() + " constructed");
    }

    @PreDestroy
    public void printBeforeDestruction() {
        System.out.println("FirstBean with code " + this.hashCode() + " destroyed");
    }

    @Override
    public void print() {
        System.out.println("This is FirstBean");
    }
}
