package com.yash.tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.config.EmployeeConfig;
import com.yash.dao.EmployeeDao;

public class TestAOP {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class))
		{
			EmployeeDao dao=context.getBean(EmployeeDao.class);
			dao.getAllEmp();
		}
	}
}
