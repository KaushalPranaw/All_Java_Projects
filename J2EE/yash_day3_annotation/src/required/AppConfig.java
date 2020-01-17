package required;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("required")
public class AppConfig {

	@Bean
	public Emp emp()
	{
		Emp e=new Emp();
		e.setName("a");
		return e;
	}
}
