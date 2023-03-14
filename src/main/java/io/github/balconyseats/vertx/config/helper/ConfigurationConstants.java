package io.github.balconyseats.vertx.config.helper;

import java.util.List;

public final class ConfigurationConstants {

    public static final List<String> VERTX_APP_CLASSPATH_CONFIG = List.of("application.properties", "application.json", "application.yml");
    public static final String VERTX_APP_SYSTEM_PROPERTY_NAME = "vertx.configuration";
    public static final String VERTX_APP_ENV_VARIABLE_NAME = "VERTX_CONFIGURATION";
    public static final String VERTX_APP_CONFIGURATION_CLASSPATH_DISABLED_SYSTEM_PROPERTY = "vertx.configuration.classpath.disabled";
    public static final String VERTX_APP_CONFIGURATION_CLASSPATH_DISABLED_ENV_VARIABLE = "VERTX_CONFIGURATION_CLASSPATH_DISABLED";

    public static final char PATH_SEPARATOR = ':';


    private ConfigurationConstants() {
        //helper class
    }
}
