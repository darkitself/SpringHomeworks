package com.example.second_homework.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class FirstProduct {

    public String getProductType() {
        return "First Product with code " + hashCode();
    }
}
