package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ThirdBean implements BaseBean{
    @PostConstruct
    public void printAfterCreation() {
        System.out.println("ThirdBean with code " + this.hashCode() + " constructed");
    }

    @PreDestroy
    public void printBeforeDestruction() {
        System.out.println("ThirdBean with code " + this.hashCode() + " destroyed");
    }

    @Override
    public void print() {
        System.out.println("This is ThirdBean");
    }
}
