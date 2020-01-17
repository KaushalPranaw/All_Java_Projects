package dependsOn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestUsingAnnotation {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Bean1 bean1=context.getBean("bean1",Bean1.class);
		bean1.display();
		
		((AbstractApplicationContext) context).close();
		
	}
}
