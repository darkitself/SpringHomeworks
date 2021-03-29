package com.example.thirdhomework.event;

import com.example.thirdhomework.config.SimpleConfig;

public class ConfigEvent {
    private SimpleConfig config;

    public ConfigEvent(SimpleConfig config) {
        this.config = config;
    }

    public SimpleConfig getConfig() {
        return config;
    }

    public void setConfig(SimpleConfig config) {
        this.config = config;
    }
}
