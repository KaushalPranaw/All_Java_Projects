package com.yash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@ComponentScan("com.yash")
public class WebSecurityConfig implements WebMvcConfigurer {

	public void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.antMatcher("/").authorizeRequests().anyRequest().hasRole("ADMIN").and().httpBasic();

	}

	@Bean
	public UserDetailsService userDetailsService() throws Exception {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("pranaw").password("1234").build());
		return manager;
	}

}
