package com.example.thirdhomework.event_publisher;

import com.example.thirdhomework.config.SimpleConfig;
import com.example.thirdhomework.event.ConfigEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ConfigEventPublisher {
    private final ApplicationEventPublisher publisher;

    ConfigEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(final SimpleConfig config) {
        publisher.publishEvent(new ConfigEvent(config));
    }
}
