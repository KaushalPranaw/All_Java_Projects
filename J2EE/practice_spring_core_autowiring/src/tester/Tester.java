package tester;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Student;

public class Tester {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");) {
			Student student = context.getBean("student", Student.class);
			System.out.println(student);
		}

	}
}
