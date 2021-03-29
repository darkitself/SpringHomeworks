package com.example.thirdhomework.senders;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("'${spring.profiles.active}'!='dev'")
public class ProdSmsSender implements SmsSender{
    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("This is message from ProdSmsSender");
        System.out.println(text + " " + phoneNumber);
    }
}