package dependsOn;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("dependsOn")
public class AppConfig {

	@Bean("bean1")
	@DependsOn(value= {"bean2","bean3"})
	@Primary
	public Bean1 bean1() {
		return new Bean1();
	}

	@Bean("bean2")

	public Bean2 bean2() {
		return new Bean2();
	}

	@Bean("bean3")

	public Bean3 bean3() {
		return new Bean3();
	}
}
