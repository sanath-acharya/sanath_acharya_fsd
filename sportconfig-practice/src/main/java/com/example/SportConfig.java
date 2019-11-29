package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example")
public class SportConfig {
	@Bean
	public Coach tenniscoach() {
		return new TennisCoach(ranFortuneService())	;
		
	}
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
		
	}
	@Bean
	public FortuneService ranFortuneService() {
		return new RandomFortuneService();
		
	}
}
