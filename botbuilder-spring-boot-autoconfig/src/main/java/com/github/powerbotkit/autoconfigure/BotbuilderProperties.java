package com.github.powerbotkit.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "botbuilder")
public class BotbuilderProperties {

    private String MicrosoftAppId;

    private String MicrosoftAppPassword;
}
