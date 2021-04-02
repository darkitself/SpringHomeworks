package com.example.thirdhomework.senders;

public interface SmsSender {
    void send(String phoneNumber, String text);
}
