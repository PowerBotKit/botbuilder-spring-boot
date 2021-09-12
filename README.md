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

## License

[MIT](LICENSE) © PowerBotKit Team