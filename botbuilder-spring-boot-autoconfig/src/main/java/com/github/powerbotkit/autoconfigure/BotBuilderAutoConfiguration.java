package com.github.powerbotkit.autoconfigure;

import com.microsoft.bot.integration.spring.BotDependencyConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BotBuilderProperties.class)
public class BotBuilderAutoConfiguration extends BotDependencyConfiguration {

    private BotBuilderProperties botbuilderProperties;

    @Bean
    @Override
    public com.microsoft.bot.integration.Configuration getConfiguration() {
        if (this.botbuilderProperties == null) {
            return super.getConfiguration();
        }
        return new BotBuilderPropertiesConfiguration(this.botbuilderProperties);
    }

    public BotBuilderAutoConfiguration(BotBuilderProperties botbuilderProperties) {
        this.botbuilderProperties = botbuilderProperties;
    }
}
