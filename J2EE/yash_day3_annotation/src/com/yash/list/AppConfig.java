package com.yash.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.yash.list")
public class AppConfig {

	@Bean
	public Question emp()
	{
		return new Question(1, "pranaw", list()	, map());
		
	}
	
	@Bean
	public List<Answer> list()
	{
		List<Answer> l=new ArrayList<>();
		l.add(new Answer(1, "a", "a"));
		l.add(new Answer(2, "a", "a"));
		l.add(new Answer(3, "a", "a"));
		return l;
	}
	
	@Bean
	public Map<String, String> map()
	{
		Map<String, String> map=new HashMap<>();
		map.put("d", "d");
		map.put("e", "e");
		return map;
	}
}
