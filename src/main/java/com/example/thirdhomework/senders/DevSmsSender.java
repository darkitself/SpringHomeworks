package com.example.thirdhomework.senders;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevSmsSender implements SmsSender{
    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("This is message from DevSmsSender");
        System.out.println(text + " " + phoneNumber);
    }
}