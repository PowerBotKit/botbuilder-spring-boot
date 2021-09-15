package io.github.powerbotkit.autoconfigure;

import com.microsoft.bot.integration.Configuration;

import java.util.Objects;
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
        this.properties.setProperty(MICROSOFTAPPID, Objects.isNull(botBuilderProperties.getMicrosoftAppId()) ? "" : botBuilderProperties.getMicrosoftAppId());
        this.properties.setProperty(MICROSOFTAPPPASSWORD, Objects.isNull(botBuilderProperties.getMicrosoftAppPassword()) ? "" : botBuilderProperties.getMicrosoftAppPassword());
    }
}