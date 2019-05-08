package com.example.propertiessources.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "config/config-bankplus-dev.properties")
public class PropertiesConfig {


}
