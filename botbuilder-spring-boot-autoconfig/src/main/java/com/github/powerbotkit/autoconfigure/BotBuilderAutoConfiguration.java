package com.github.powerbotkit.autoconfigure;

import com.microsoft.bot.integration.AdapterWithErrorHandler;
import com.microsoft.bot.integration.BotFrameworkHttpAdapter;
import com.microsoft.bot.integration.spring.BotDependencyConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BotbuilderProperties.class)
public class BotBuilderAutoConfiguration extends BotDependencyConfiguration {

    private BotbuilderProperties botbuilderProperties;

    @Override
    public BotFrameworkHttpAdapter getBotFrameworkHttpAdaptor(com.microsoft.bot.integration.Configuration configuration) {
        return new AdapterWithErrorHandler(configuration);
    }

    public BotBuilderAutoConfiguration(BotbuilderProperties botbuilderProperties) {
        this.botbuilderProperties = botbuilderProperties;
    }
}
