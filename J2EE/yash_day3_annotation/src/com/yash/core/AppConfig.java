package com.yash.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yash.core")
public class AppConfig {

	@Bean
	public Employee emp()
	{
		return new Employee(1, "pranaw", add());
		
	}
	
	@Bean
	public Address add()
	{
		return new Address("magar", "pune", "india");
	}
}
