# botbuilder-spring-boot

a simple starter for [spring boot](https://spring.io/projects/spring-boot/) and [bot framework](https://docs.microsoft.com/en-us/azure/bot-service/index-bf-sdk?view=azure-bot-service-4.0)

## Usage

add dependency

```xml
<dependency>
    <groupId>com.github.powerbotkit</groupId>
    <artifactId>botbuilder-spring-boot-starter</artifactId>
    <version>0.0.0</version>
</dependency>
```

enable botbuilder support

```java
@SpringBootApplication
@EnableBotBuilder
public class EchoBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoBotApplication.class, args);
	}

}
```

create a spring bean what Implement an interface

```java
@Component
public class EchoBot extends ActivityHandler {

    @Override
    protected CompletableFuture<Void> onMessageActivity(TurnContext turnContext) {
        return turnContext.sendActivity(
                MessageFactory.text("Echo: " + turnContext.getActivity().getText())
        ).thenApply(sendResult -> null);
    }

    @Override
    protected CompletableFuture<Void> onMembersAdded(
            List<ChannelAccount> membersAdded,
            TurnContext turnContext
    ) {
        return membersAdded.stream()
                .filter(
                        member -> !StringUtils
                                .equals(member.getId(), turnContext.getActivity().getRecipient().getId())
                ).map(channel -> turnContext.sendActivity(MessageFactory.text("Hello and welcome!")))
                .collect(CompletableFutures.toFutureList()).thenApply(resourceResponses -> null);
    }
}
```

## License

[MIT](LICENSE) © PowerBotKit Team