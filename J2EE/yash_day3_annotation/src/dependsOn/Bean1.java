package dependsOn;

import org.springframework.beans.factory.annotation.Autowired;

public class Bean1 {

	@Autowired
	private Bean2 bean2;
	
	@Autowired
	private Bean3 bean3;
	public Bean1() {
		System.out.println("in const "+getClass().getName());
	}
	public Bean1(Bean2 bean2, Bean3 bean3) {
		super();
		this.bean2 = bean2;
		this.bean3 = bean3;
	}
	
	void display()
	{
		System.out.println("bean1");
		bean2.display();
		bean3.display();
	}
	
	
}
