package com.yash.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.yash")
@PropertySource(value= {"classpath:application.properties"})
public class HibernateConfig {
	
	@Autowired
	Environment environment;
	
	@Bean
	public LocalSessionFactoryBean getSF()
	{
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setHibernateProperties(hibernateProperties());
		sf.setPackagesToScan(new String[] {"com.yash.pojos"});
		return sf;
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(environment.getProperty("jdbc.drivername"));
		ds.setUrl(environment.getProperty("jdbc.url"));
		ds.setUsername(environment.getProperty("jdbc.username"));
		ds.setPassword(environment.getProperty("jdbc.password"));
		return ds;
	}
	
	private Properties hibernateProperties()
	{
		Properties properties=new Properties();
		properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		properties.put("hibernate.enable_lazy_load_no_trans", environment.getProperty("hibernate.enable_lazy_load_no_trans"));
		properties.put("current_session_context_class", environment.getProperty("current_session_context_class"));
		return properties;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager txManager(SessionFactory sf)
	{
		HibernateTransactionManager txmanager=new HibernateTransactionManager();
		txmanager.setSessionFactory(sf);
		return txmanager;
	}
	
	
	
	/* @Bean(name = "entityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean emf() {
	        LocalContainerEntityManagerFactoryBean emf = ...
	        emf.setDataSource(dataSource);
	        emf.setPackagesToScan(new String[] {"your.package"});
	        emf.setJpaVendorAdapter(
	        new HibernateJpaVendorAdapter());
	        return emf;
	   }
	
	@Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(emf);
        tm.setDataSource(dataSource);
        return tm;
    }*/

}
