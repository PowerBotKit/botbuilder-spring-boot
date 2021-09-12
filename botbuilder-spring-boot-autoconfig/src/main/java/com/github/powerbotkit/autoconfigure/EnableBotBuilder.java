package com.github.powerbotkit.autoconfigure;

import com.microsoft.bot.integration.spring.BotController;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({BotBuilderAutoConfiguration.class, BotController.class})
public @interface EnableBotBuilder {
}
