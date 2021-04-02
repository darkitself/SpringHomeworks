package com.example.thirdhomework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.convert.DurationUnit;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@ConstructorBinding
@ConfigurationProperties(prefix = "app")
public final class SimpleConfig {

    private final Integer firstConfig;
    private final SecondConfig secondConfig;

    public SimpleConfig(Integer firstConfig, SecondConfig secondConfig) {
        this.firstConfig = firstConfig;
        this.secondConfig = secondConfig;
    }

    public Integer getFirstConfig() {
        return firstConfig;
    }

    public SecondConfig getSecondConfig() {
        return secondConfig;
    }

    @Override
    public String toString() {
        return MessageFormat.format("first-config: {0}\n second-config: \n\t subconfig: {1}\n\t user: {2}\n\t ttl: {3}\n",
                firstConfig, secondConfig.subconfig, secondConfig.user, secondConfig.ttl.getSeconds());
    }

    public static class SecondConfig {
        private final String subconfig;
        private final String user;
        @DurationUnit(ChronoUnit.SECONDS)
        private final Duration ttl;

        public SecondConfig(String subconfig, String user, Duration ttl) {
            this.subconfig = subconfig;
            this.user = user;
            this.ttl = ttl;
        }

        public String getSubconfig() {
            return subconfig;
        }

        public String getUser() {
            return user;
        }

        public Duration getTtl() {
            return ttl;
        }
    }
}