package dependsOn;

public class Bean2 {

	public Bean2() {
		System.out.println("in const "+getClass().getName());
	}
	
	void display()
	{
		System.out.println("Bean2");
	}

	
}
