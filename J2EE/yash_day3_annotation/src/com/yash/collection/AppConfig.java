package com.yash.collection;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yash.collection")
public class AppConfig {

	@Bean
	public Question emp()
	{
		return new Question(1, "java", list());
		
	}
	
	@Bean
	public List<String> list()
	{
		return Arrays.asList("a","b","c");
	}
}
