package com.yash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yash.aop.EmployeeAOP;
import com.yash.dao.EmployeeDao;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.yash.aop")
public class EmployeeConfig {

	@Bean
	public EmployeeDao dao()
	{
		return new EmployeeDao();
	}
	
	@Bean
	
	public EmployeeAOP aop()
	{
		return new EmployeeAOP();
	}
}
