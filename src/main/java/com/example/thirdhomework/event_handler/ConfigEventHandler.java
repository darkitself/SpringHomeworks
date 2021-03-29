package com.example.thirdhomework.event_handler;

import com.example.thirdhomework.event.ConfigEvent;
import com.example.thirdhomework.senders.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class ConfigEventHandler {

    @Autowired
    SmsSender sender;

    @EventListener
    void handleUserRemovedEvent(ConfigEvent event) {
        sender.send("111", "Name");
        System.out.println(event.getConfig());
    }
}
