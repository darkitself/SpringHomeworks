package com.homework.sixth_homework.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app.aspect")
public class AspectConfig {
    private Integer executionTimes;

    public Integer getExecutionTimes() {
        return executionTimes;
    }

    public void setExecutionTimes(Integer maxExecutionTimes) {
        this.executionTimes = maxExecutionTimes;
    }
}
