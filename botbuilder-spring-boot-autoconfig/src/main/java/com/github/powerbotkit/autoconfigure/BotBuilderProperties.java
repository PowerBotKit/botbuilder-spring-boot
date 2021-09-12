package com.github.powerbotkit.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.StringJoiner;

@ConfigurationProperties(prefix = "botbuilder")
public class BotBuilderProperties {

    private String microsoftAppId;

    private String microsoftAppPassword;

    public String getMicrosoftAppId() {
        return microsoftAppId;
    }

    public void setMicrosoftAppId(String microsoftAppId) {
        this.microsoftAppId = microsoftAppId;
    }

    public String getMicrosoftAppPassword() {
        return microsoftAppPassword;
    }

    public void setMicrosoftAppPassword(String microsoftAppPassword) {
        this.microsoftAppPassword = microsoftAppPassword;
    }

    public BotBuilderProperties() {
        super();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BotBuilderProperties.class.getSimpleName() + "[", "]")
                .add("microsoftAppId='" + microsoftAppId + "'")
                .add("microsoftAppPassword='" + microsoftAppPassword + "'")
                .toString();
    }
}
