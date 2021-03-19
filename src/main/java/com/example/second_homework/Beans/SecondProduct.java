package com.example.second_homework.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class SecondProduct {

    public String getProductType() {
        return "Second Product with code " + hashCode();
    }
}
