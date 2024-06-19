package com.example.examplemod;


import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = ExampleMod.MODID)
public class ExampleModConfig {

    public static ExampleModConfig INSTANCE;

    public static void init() {
        if (INSTANCE == null) {
            INSTANCE = Configuration.registerConfig(ExampleModConfig.class, ConfigFormats.yaml()).getConfigInstance();
        }
    }
    @Configurable
    public boolean testConfig = false;
}
