package com.yash.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.dao.EmployeeDao;
import com.yash.dao.EmployeeDaoImpl;

@Configuration
public class DataSourceConfig {

	@Bean
	public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
 
        return dataSource;
    }
	
	/*<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
	<property name="dataSource" ref="ds"/>
</bean>

<bean id="dao" class="com.yash.dao.EmployeeDao">
	<property name="jdbcTemplate" ref="jdbcTemplate"/>
</bean>*/
	
	@Bean
	public JdbcTemplate jdbctemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(mysqlDataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public EmployeeDaoImpl dao()
	{
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.setJdbcTemplate(jdbctemplate());
		return dao;
	}
	
}
