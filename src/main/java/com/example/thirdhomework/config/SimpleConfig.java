package com.example.thirdhomework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.text.MessageFormat;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class SimpleConfig {
    private Integer firstConfig;

    private SecondConfig secondConfig;

    public Integer getFirstConfig() {
        return firstConfig;
    }

    public SecondConfig getSecondConfig() {
        return secondConfig;
    }


    public void setFirstConfig(Integer firstConfig) {
        this.firstConfig = firstConfig;
    }

    public void setSecondConfig(SecondConfig secondConfig) {
        this.secondConfig = secondConfig;
    }

    @Override
    public String toString() {
        return MessageFormat.format("first-config: {0}\n second-config: \n\t subconfig: {1}\n\t user: {2}\n\t ttl: {3}\n",
                firstConfig, secondConfig.subconfig, secondConfig.user, secondConfig.ttl);
    }

    public static class SecondConfig {
        private String subconfig;
        private String user;
        private String ttl;

        public String getSubconfig() {
            return subconfig;
        }

        public String getUser() {
            return user;
        }

        public String getTtl() {
            return ttl;
        }

        public void setSubconfig(String subconfig) {
            this.subconfig = subconfig;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }
    }
}