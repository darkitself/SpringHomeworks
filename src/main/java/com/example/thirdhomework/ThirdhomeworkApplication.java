package com.example.thirdhomework;

import com.example.thirdhomework.config.SimpleConfig;
import com.example.thirdhomework.event_publisher.ConfigEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThirdhomeworkApplication implements CommandLineRunner {
    @Autowired
    SimpleConfig config;
    @Autowired
    ConfigEventPublisher publisher;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ThirdhomeworkApplication.class);
        app.run();
    }

    public void run(String... args) throws Exception {
        publisher.publishEvent(config);
    }
}
