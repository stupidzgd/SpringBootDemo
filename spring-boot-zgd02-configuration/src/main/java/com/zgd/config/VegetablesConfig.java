package com.zgd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenpepper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpepper() {
        return greenpepper;
    }

    public void setGreenpepper(String greenpepper) {
        this.greenpepper = greenpepper;
    }
}
