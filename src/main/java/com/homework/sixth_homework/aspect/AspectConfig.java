package com.homework.sixth_homework.aspect;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app.config")
public class AspectConfig {
    private Integer maxExecutionTimes;
    public Integer getExecutionTimes() {
        return maxExecutionTimes;
    }

    public void setExecutionTimes(Integer maxExecutionTimes) {
        this.maxExecutionTimes = maxExecutionTimes;
    }
}
