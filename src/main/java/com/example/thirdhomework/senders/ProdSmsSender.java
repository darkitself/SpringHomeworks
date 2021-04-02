package com.example.thirdhomework.senders;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdSmsSender implements SmsSender{
    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("This is message from ProdSmsSender");
        System.out.println(text + " " + phoneNumber);
    }
}