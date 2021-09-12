package com.github.powerbotkit.autoconfigure;

import com.microsoft.bot.integration.Configuration;

import java.util.Properties;

public class BotBuilderPropertiesConfiguration implements Configuration {

    private static final String MICROSOFTAPPID = "MicrosoftAppId";
    private static final String MICROSOFTAPPPASSWORD = "MicrosoftAppPassword";

    private Properties properties;

    @Override
    public String getProperty(String key) {
        return null;
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public String[] getProperties(String key) {
        return new String[0];
    }

    public BotBuilderPropertiesConfiguration(BotBuilderProperties botBuilderProperties) {
        super();
        this.properties = new Properties();
        this.properties.setProperty(MICROSOFTAPPID, botBuilderProperties.getMicrosoftAppId());
        this.properties.setProperty(MICROSOFTAPPPASSWORD, botBuilderProperties.getMicrosoftAppPassword());
    }
}
